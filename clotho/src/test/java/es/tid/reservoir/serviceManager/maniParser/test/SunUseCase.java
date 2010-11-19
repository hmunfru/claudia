/*

 (c) Copyright 2010 Telefonica, I+D. Printed in Spain (Europe). All Righ
 Reserved.

 The copyright to the software program(s) is property of Telefonica I+D.
 The program(s) may be used and or copied only with the express written
 consent of Telefonica I+D or in acordance with the terms and conditions
 stipulated in the agreement/contract under which the program(s) have
 been supplied.

 */

package es.tid.reservoir.serviceManager.maniParser.test;

import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.telefonica.claudia.slm.common.SMConfiguration;
import com.telefonica.claudia.slm.deployment.Customer;
import com.telefonica.claudia.slm.deployment.ServiceApplication;
import com.telefonica.claudia.slm.deployment.VEE;
import com.telefonica.claudia.slm.deployment.VEEReplica;
import com.telefonica.claudia.slm.maniParser.ManiParserException;
import com.telefonica.claudia.slm.maniParser.Parser;
import com.telefonica.claudia.slm.serviceconfiganalyzer.ServiceConfigurationAnalyzer;


public class SunUseCase {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testParser2_sun() {

		String xmlFileName = "src/test/resources/sun.xml";

		try {
			
			SMConfiguration.loadProperties();
			
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("procesing " + xmlFileName);
			
			Parser p = new Parser(xmlFileName, new Customer("SP_STANDARD"), "ANONYMOUSSERVICE");
			p.parse();

			// Manually populate the replicas to continue the test
			ServiceApplication sa = p.getServiceApplication();
			Iterator<VEE> vees = sa.getVEEs().iterator();
			VEE master = vees.next();
			VEE executor = vees.next();

			VEEReplica vee1 = new VEEReplica(master);
			VEEReplica vee2 = new VEEReplica(executor);

			master.registerVEEReplica(vee1);
			executor.registerVEEReplica(vee2);
			
			HashMap<String,String> netmasks = new HashMap<String,String>();
			netmasks.put("1_sge_net","255.255.255.0");
			netmasks.put("0_admin_net","255.255.255.0");
			
			HashMap<String,String> dnsServers = new HashMap<String,String>();
			dnsServers.put("1_sge_net","12.23.34.45");
			dnsServers.put("0_admin_net","12.23.34.45");
			
			HashMap<String,String> gateways = new HashMap<String,String>();
			gateways.put("1_sge_net","10.0.1.254");
			gateways.put("0_admin_net","10.0.2.254");
			
			HashMap<String, HashMap<String,String>> eps = new HashMap<String, HashMap<String,String>>();
			HashMap<String,String> eps1 = new HashMap<String,String>();
			eps1.put("VEEMaster", "10.0.0.1");
			eps.put("1_sge_net", eps1);
			
			/* Let's generate the OVF Environment for VEEMaster and VEEExecutor */
			p.generateEnvironments("VEEMaster",0,getFreshIPS(),netmasks,dnsServers,gateways,eps);
			p.generateEnvironments("VEEExecutor",0,getFreshIPS(),netmasks,dnsServers,gateways,eps);

			/* Testing SCA */
			ServiceConfigurationAnalyzer sca = new ServiceConfigurationAnalyzer();
			HashMap<String,String> hm = sca.getBuildingBlockAvailabilyLabel(sa);
			for (Iterator<String> i = hm.keySet().iterator(); i.hasNext() ; ) {
				String vee = i.next();
				// FIXME: use the proper logger
				System.out.println("availability for VEE " + vee + ": " + hm.get(vee));
			}
			
			hm = sca.getBuildingBlockCapacityLabel(sa);
			for (Iterator<String> i = hm.keySet().iterator(); i.hasNext() ; ) {
				String vee = i.next();
				// FIXME: use the proper logger
				System.out.println("building block for VEE " + vee + ": " + hm.get(vee));
			}
			
			HashMap<String,ArrayList<String>> hml = sca.getAllowableSites(sa);
			for (Iterator<String> i = hml.keySet().iterator(); i.hasNext() ; ) {
				String vee = i.next();
				// FIXME: use the proper logger
				String sites = "";
				for (Iterator<String> ii = hml.get(vee).iterator(); ii.hasNext();  ) {
					String site = ii.next();
					sites += site + " ";
				}
				
				System.out.println("allowed sites for VEE " + vee + ": " + sites);
			}
			
		} catch (Throwable t) {
			t.printStackTrace();
			fail(t.getMessage());			
		}
	}
	
	HashMap<String,ArrayList<String>> getFreshIPS() {	
		
		ArrayList<String> net1 = new ArrayList<String>();
		net1.add("10.0.0.1");
		ArrayList<String> net2 = new ArrayList<String>();
		net2.add("10.0.1.1");
	
		HashMap<String,ArrayList<String>> ips = new HashMap<String,ArrayList<String>>();
		ips.put("1_sge_net",net1);
		ips.put("0_admin_net",net2);
	
		return ips;
	
	}
	
	
}
