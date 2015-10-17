package calculator_server;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Calculator {
	public Calculator(){
		
	}
	
	@WebMethod
	public int sumar(int a,int b){
		return a+b;
	}
	
	@WebMethod
	public int restar(int a, int b){
		return a-b;
	}
	
	@WebMethod
	public int multiplicar(int a, int b){
		return a*b;
	}
	
}
