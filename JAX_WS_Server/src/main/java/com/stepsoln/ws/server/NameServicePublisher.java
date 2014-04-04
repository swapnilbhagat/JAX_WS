/**
 * 
 */
package com.stepsoln.ws.server;

import javax.xml.ws.Endpoint;

/**
 * Class to Publish Web service.
 * 
 * @author SwapnilB
 * 
 */
public class NameServicePublisher
{
	public static void main(String[] args)
	{
		Endpoint.publish("http://localhost:8080/ws/nameService", new NameServiceImpl());
		System.out.println("NameService is published at http://localhost:8080/ws/nameService");
	}
}
