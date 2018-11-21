package com.epam.app;

import static org.junit.Assert.*;

import java.net.URI;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.junit.Test;

import com.epam.app.HelloService;

public class HelloServiceTest {
	
	Login l;
	
	void setUp() {
		l=new Login();
		l.setUserName("Sri");
	}
	@Test
	public void test() {
		HelloService helloServiceObject = new HelloService();
		assertNotNull(helloServiceObject);
	}
	
	@Test
	public void askHelloMethodTest() {
		HelloService helloServiceObject = new HelloService();
		assertEquals("Hello From Narsimlu",helloServiceObject.askHello());
	}
	@Test
	public void testMethod()
	{
		
	}

}
