package com.epam.app.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@XmlRootElement
public class UpdateEduDocServiceTest {
	
	

	@Test
	public void test() {
		UpdateEduDocService helloServiceObject = new UpdateEduDocService();
		assertNotNull(helloServiceObject);
	}
	
	@Test
	public void askHelloMethodTest() {
		UpdateEduDocService helloServiceObject = new UpdateEduDocService();
		assertEquals("Hello From Srikanth",helloServiceObject.getUserID());
	}
	
	@Test
	public void askHelloServiceTest() {
		
		Client client = Client.create();
		WebResource webresource = client.resource("http://localhost:9090/app/rest/hello");
		
        
        String response = webresource.accept(MediaType.APPLICATION_JSON).toString();
        
		assertEquals("Hello From Srikanth",response);
	}
	
	
	@Test
	public void askHello1ServiceTest() {
	/*	try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource("http://localhost:8080/RESTfulExample/rest/json/metallica/get");

			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }
		
        
		assertEquals("Hello From Srikanth",response);
	}
	*/

}
}
