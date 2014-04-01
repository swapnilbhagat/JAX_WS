/**
 * 
 */
package com.stepsoln.ws.server;

import javax.jws.WebService;

/**
 * @author SwapnilB
 * 
 */
@WebService(endpointInterface = "com.stepsoln.ws.server.WS")
public class WSImpl implements WS
{
	public String getFullName(String firstName, String lastName)
	{
		return firstName + " " + lastName;
	}

}
