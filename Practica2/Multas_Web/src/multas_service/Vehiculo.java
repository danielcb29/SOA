package multas_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase Vehiculo, informacion basica, metodo contructor y gets
 * @author daniel
 *	
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehiculo", propOrder = {
    "placa",
    "marca",
    "year",
})
public class Vehiculo {
	
	@XmlElement(required = true)
	private String placa; 
	@XmlElement(required = true)
	private String marca; 
	@XmlElement(required = true)
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
