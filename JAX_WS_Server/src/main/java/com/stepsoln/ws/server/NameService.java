/**
 * 
 */
package com.stepsoln.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

;

/**
 * Web Service Endpoint.
 * 
 * @author SwapnilB
 * 
 */
@WebService
public interface NameService
{
	@WebMethod
	public String getFullName(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName);
}
