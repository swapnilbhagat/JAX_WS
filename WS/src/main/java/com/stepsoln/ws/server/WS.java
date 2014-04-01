/**
 * 
 */
package com.stepsoln.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;;

/**
 * @author SwapnilB
 * 
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface WS
{
	@WebMethod
	public String getFullName(String firstName, String lastName);
}
