package com.epam.app;

import static org.junit.Assert.*;

import java.net.URI;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.junit.Test;

import com.epam.app.HelloService;

public class HelloServiceTest {
	
/*	private static URI getBaseURI() {
	    return UriBuilder.fromUri("http://localhost:9000/rest/hello").build();
	  }
*/
	@Test
	public void test() {
		HelloService helloServiceObject = new HelloService();
		assertNotNull(helloServiceObject);
	}
	
	@Test
	public void askHelloMethodTest() {
		HelloService helloServiceObject = new HelloService();
		assertEquals("Hello From Srikanth",helloServiceObject.askHello());
	}
/*	
	@Test
	public void askHelloServiceTest() {
		
		//ClientConfig config = new ClientConfig();
		
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(getBaseURI());
        
        String response = target.path("rest").
                path("hello").
                request().
                accept(MediaType.TEXT_PLAIN).
                get(Response.class)
                .toString();
        
		assertEquals("Hello From Srikanth",response);
	}
*/
}
