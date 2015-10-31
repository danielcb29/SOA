package jaxrs_helloservice;

import javax.ws.rs.*;

@Path("/helloworld")
public class HelloWorldResource {

	public HelloWorldResource(){
		System.out.println("Creada instancia de HelloWorldResource");
	}
	// The Java method will process HTTP GET requests
	@GET
	//// The Java method will produce content identified by the MIME Media
	//// type "text/plain"
	@Produces("text/plain")
	public String getClichedMessage() {
		// Return some cliched textual content
		System.out.println("GET getClichedMessage invoked");
		return "Hello World";
	}
	
	@GET
	@Path("/{name}")
	@Produces("text/plain")
	public String sayHello(@PathParam("name") String name){
		return "Hello "+name+"!";
	}
}
