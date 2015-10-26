package multas_service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Clase Vehiculo, informacion basica, metodo contructor y gets
 * @author daniel
 *	
 */

public class Vehiculo {
	private String placa; 
	private String marca; 
	private String year; 
	
	public Vehiculo(String paramPlaca,String paramMarca,String paramYear){
		placa = paramPlaca;
		marca = paramMarca;
		year = paramYear; 
	}
	
	public String getPlaca(){
		return placa;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getYear(){
		return year;
	}
	
}
