package calculator_server;

import calculator_server.CalculatorService;
import javax.xml.ws.WebServiceRef;

public class CalculatorClientApp {
	private static CalculatorService service = new CalculatorService();
	private static Calculator port = service.getCalculatorPort();
	
	public static void main(String[] args) {
		int suma = suma(4,4);
		int resta = resta(14,10);
		int multi = multiplicar(4,4);
		System.out.println("Los resultado de las operaciones son: \nSuma:"+suma+"\nResta:"+resta+"\nMultiplicacion:"+multi);
		
	}
	private static int suma(int a, int b){
		return port.sumar(a, b);
	}
	private static int resta(int a , int b){
		return port.restar(a,b);
	}
	private static int multiplicar(int a, int b){
		return port.multiplicar(a, b);
	}
}
