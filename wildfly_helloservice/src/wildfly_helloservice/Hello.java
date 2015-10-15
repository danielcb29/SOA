package wildfly_helloservice;
import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService
public class Hello {
	private String message = new String("Hello, to Service World Mr ");
	
	public Hello() {
		
	}
	 @WebMethod
	 public String sayHello(String name) {
		 return message + name + ".";
	 }
}