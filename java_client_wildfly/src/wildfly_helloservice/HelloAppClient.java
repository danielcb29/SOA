package wildfly_helloservice;

import wildfly_helloservice.HelloService;
import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
	//@WebServiceRef(wsdlLocation ="http://localhost:8080/wildfly_heloservice/Hello?wsdl")
	private static HelloService service;
	
	public static void main(String[] args) {
		System.out.println(sayHello("Daniel"));
	}
	private static String sayHello(java.lang.String arg0) {
		 //Sin utilizar @WebServiceRef sería necesario
		 service=new HelloService();
		 Hello port = service.getHelloPort();
		 return port.sayHello(arg0);
	}
}
