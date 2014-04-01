/**
 * 
 */
package com.stepsoln.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

;

/**
 * Web Service Endpoint.
 * 
 * @author SwapnilB
 * 
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface NameService
{
	@WebMethod
	public String getFullName(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName);
}
