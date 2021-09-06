package com.app.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path ("/")
public class HelloController {
	
	
	@GET
	public String sayHelloFromGet() {
		return "Hello player app from GET";
	}


	@POST
	public String sayHelloFromPost() {
		return "Hello player app from POST";
	}

	@PUT
	public String sayHelloFromPut() {
		return "Hello player app from PUT";
	}

	@DELETE
	public String sayHelloFromDelete() {
		return "Hello player app from DELETE";
	}
}
