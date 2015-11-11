package es.unex.aos;

import java.net.URI;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;


public class HelloClient {
	public static void main(String[] args) {
		Client c = ClientBuilder.newClient();
		WebTarget target = c.target(getBaseURI());
		//Recuperando info. en una cadena
		String cad = target.request(MediaType.TEXT_PLAIN).get(String.class);
		System.out.println("Texto: "+cad);
		
		String cad_xml = target.request(MediaType.TEXT_XML).get(String.class);
		System.out.println("XML: "+cad_xml);

		String cad_html = target.request(MediaType.TEXT_HTML).get(String.class);
		System.out.println("HTML: "+cad_html);		
		
		Response response = target.request(MediaType.TEXT_PLAIN).get();
		System.out.println(response.toString());
		

	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8080/jaxrs_example04/example/hello").build();
				 
	}

}