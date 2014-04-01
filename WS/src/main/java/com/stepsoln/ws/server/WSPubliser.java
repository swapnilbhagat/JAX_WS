/**
 * 
 */
package com.stepsoln.ws.server;

import javax.xml.ws.Endpoint;

/**
 * @author SwapnilB
 * 
 */
public class WSPubliser
{
	public static void main(String[] args)
	{
		Endpoint.publish("http://localhost:8080/ws/test", new WSImpl());
	}
}
