/**
 * 
 */
package com.stepsoln.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.stepsoln.ws.client.generated.WS;

/**
 * @author SwapnilB
 * 
 */
public class Client
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://localhost:8080/ws/test?wsdl");
		Service service = Service.create(url, new QName("http://server.ws.stepsoln.com/", "WSImplService"));
		WS ws = service.getPort(WS.class);
		String fullName = ws.getFullName("Swapnil", "Bhagat");
		System.out.println(fullName);
	}
}
