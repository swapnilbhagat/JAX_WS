/**
 * 
 */
package com.stepsoln.ws.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.stepsoln.ws.server.NameService;

/**
 * Client to read/invoke Published NameService.
 * 
 * @author SwapnilB
 * 
 */
public class NameServiceClient
{

	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://localhost:8080/ws/nameService?wsdl");
		Service service = Service.create(url, new QName("http://server.ws.stepsoln.com/", "NameServiceImplService"));
		NameService nameService = service.getPort(NameService.class);
		String fullName = nameService.getFullName("Swapnil", "Bhagat");
		System.out.println(fullName);
	}
}
