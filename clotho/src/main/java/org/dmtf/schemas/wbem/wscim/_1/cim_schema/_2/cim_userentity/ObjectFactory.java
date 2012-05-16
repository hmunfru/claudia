//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.12 at 03:51:35 PM CET 
//


package org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_userentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.dmtf.schemas.wbem.wscim._1.common.CimString;
import org.dmtf.schemas.wbem.wscim._1.common.CimUnsignedLong;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_userentity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CIMUserEntity_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", "CIM_UserEntity");
    private final static QName _Generation_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", "Generation");
    private final static QName _Caption_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", "Caption");
    private final static QName _InstanceID_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", "InstanceID");
    private final static QName _Description_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", "Description");
    private final static QName _ElementName_QNAME = new QName("http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", "ElementName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_userentity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public Caption createCaption() {
        return new Caption();
    }

    /**
     * Create an instance of {@link CIMUserEntityType }
     * 
     */
    public CIMUserEntityType createCIMUserEntityType() {
        return new CIMUserEntityType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIMUserEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", name = "CIM_UserEntity")
    public JAXBElement<CIMUserEntityType> createCIMUserEntity(CIMUserEntityType value) {
        return new JAXBElement<CIMUserEntityType>(_CIMUserEntity_QNAME, CIMUserEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimUnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", name = "Generation")
    public JAXBElement<CimUnsignedLong> createGeneration(CimUnsignedLong value) {
        return new JAXBElement<CimUnsignedLong>(_Generation_QNAME, CimUnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Caption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", name = "Caption")
    public JAXBElement<Caption> createCaption(Caption value) {
        return new JAXBElement<Caption>(_Caption_QNAME, Caption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", name = "InstanceID")
    public JAXBElement<CimString> createInstanceID(CimString value) {
        return new JAXBElement<CimString>(_InstanceID_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", name = "Description")
    public JAXBElement<CimString> createDescription(CimString value) {
        return new JAXBElement<CimString>(_Description_QNAME, CimString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CimString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_UserEntity", name = "ElementName")
    public JAXBElement<CimString> createElementName(CimString value) {
        return new JAXBElement<CimString>(_ElementName_QNAME, CimString.class, null, value);
    }

}
