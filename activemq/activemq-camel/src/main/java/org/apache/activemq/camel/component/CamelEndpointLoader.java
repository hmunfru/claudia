/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.camel.component;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;

import org.apache.activemq.EnhancedConnection;
import org.apache.activemq.advisory.DestinationEvent;
import org.apache.activemq.advisory.DestinationListener;
import org.apache.activemq.advisory.DestinationSource;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Endpoint;
import org.apache.camel.component.jms.JmsEndpoint;
import org.apache.camel.component.jms.JmsQueueEndpoint;
import org.apache.camel.util.ObjectHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A helper bean which populates a {@link CamelContext} with ActiveMQ Queue endpoints
 *
 * @version $Revision: 1.1 $
 * @org.apache.xbean.XBean
 */
public class CamelEndpointLoader implements CamelContextAware {
    private static final transient Log LOG = LogFactory.getLog(CamelEndpointLoader.class);
    private CamelContext camelContext;
    private EnhancedConnection connection;
    private ConnectionFactory connectionFactory;
    private ActiveMQComponent component;

    public CamelEndpointLoader() {
    }

    public CamelEndpointLoader(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    /**
     *
     * @throws Exception
     * @org.apache.xbean.InitMethod
     */
    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        ObjectHelper.notNull(camelContext, "camelContext");
        if (connection == null) {
            Connection value = getConnectionFactory().createConnection();
            if (value instanceof EnhancedConnection) {
                connection = (EnhancedConnection) value;
            }
            else {
                throw new IllegalArgumentException("Created JMS Connection is not an EnhancedConnection: " + value);
            }
        }
        connection.start();
        DestinationSource source = connection.getDestinationSource();
        source.setDestinationListener(new DestinationListener() {
            public void onDestinationEvent(DestinationEvent event) {
                try {
                    ActiveMQDestination destination = event.getDestination();
                    if (destination instanceof ActiveMQQueue) {
                        ActiveMQQueue queue = (ActiveMQQueue) destination;
                        if (event.isAddOperation()) {
                            addQueue(queue);
                        }
                        else {
                            removeQueue(queue);
                        }
                    }
                    else if (destination instanceof ActiveMQTopic) {
                      ActiveMQTopic topic = (ActiveMQTopic) destination;
                      if (event.isAddOperation()) {
                          addTopic(topic);
                      }
                      else {
                          removeTopic(topic);
                      }
                    }
                }
                catch (Exception e) {
                    LOG.warn("Caught: " + e, e);
                }
            }
        });

        Set<ActiveMQQueue> queues = source.getQueues();
        for (ActiveMQQueue queue : queues) {
            addQueue(queue);
        }

        Set<ActiveMQTopic> topics = source.getTopics();
        for (ActiveMQTopic topic : topics) {
            addTopic(topic);
        }
    }


    /**
     *
     * @throws Exception
     * @org.apache.xbean.DestroyMethod
     */
    @PreDestroy
    public void destroy() throws Exception {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }

    // Properties
    //-------------------------------------------------------------------------
    public CamelContext getCamelContext() {
        return camelContext;
    }

    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    public EnhancedConnection getConnection() {
        return connection;
    }

    public ConnectionFactory getConnectionFactory() {
        if (connectionFactory == null
                && getComponent().getConfiguration() instanceof ActiveMQConfiguration) {
            connectionFactory = ((ActiveMQConfiguration) getComponent()
                    .getConfiguration()).createConnectionFactory();
        }
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public ActiveMQComponent getComponent() {
        if (component == null) {
            component = camelContext.getComponent("activemq", ActiveMQComponent.class);
        }
        return component;
    }

    public void setComponent(ActiveMQComponent component) {
        this.component = component;
    }

    // Implementation methods
    //-------------------------------------------------------------------------

    protected void addQueue(ActiveMQQueue queue) throws Exception {
        String queueUri = getQueueUri(queue);
        ActiveMQComponent jmsComponent = getComponent();
        Endpoint endpoint = new JmsQueueEndpoint(queueUri, jmsComponent, queue.getPhysicalName(), jmsComponent.getConfiguration());
        camelContext.addEndpoint(queueUri, endpoint);
    }

    protected String getQueueUri(ActiveMQQueue queue) {
        return "activemq:" + queue.getPhysicalName();
    }

    protected void removeQueue(ActiveMQQueue queue) throws Exception {
        String queueUri = getQueueUri(queue);
        // lur cache of endpoints so they will disappear in time
        // this feature needs a new component api - list available endpoints
        //camelContext.removeEndpoints(queueUri);
    }
    
    protected void addTopic(ActiveMQTopic topic) throws Exception {
        String topicUri = getTopicUri(topic);
        ActiveMQComponent jmsComponent = getComponent();
        Endpoint endpoint = new JmsEndpoint(topicUri, jmsComponent, topic.getPhysicalName(), true, jmsComponent.getConfiguration());
        camelContext.addEndpoint(topicUri, endpoint);
    }

    protected String getTopicUri(ActiveMQTopic topic) {
        return "activemq:topic:" + topic.getPhysicalName();
    }

    protected void removeTopic(ActiveMQTopic topic) throws Exception {
        String topicUri = getTopicUri(topic);
        // lur cache of endpoints so they will disappear in time
        // this feature needs a new component api - list available endpoints
        //camelContext.removeEndpoints(topicUri);
    }
}
