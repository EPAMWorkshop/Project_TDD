package com.epam.app;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloService extends Login implements Service
{
	Login l=new Login();
	
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String askHello() {
		return "Hello From Narsimlu";
  }
	@POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Override
    public String sayHello(@FormParam("name") String name) throws IOException {
		if (name == null) { return "Hello"; }

		return "Hello " + name;

   }
	
	
    
}