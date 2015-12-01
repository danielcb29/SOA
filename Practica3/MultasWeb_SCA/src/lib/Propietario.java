package lib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase Propietario, informacion basica, metodo constructor y gets
 * @author Daniel Correa Barrios
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Propietario", propOrder = {
    "nombre",
    "apellido",
    "dni"
})
public class Propietario {
	
	@XmlElement(required = true)
	private String nombre;
	@XmlElement(required = true)
	private String apellido; 
	@XmlElement(required = true)
	private String dni; 
	
	public Propietario(String paramNombre, String paramApellido, String paramDNI){
		nombre = paramNombre;
		apellido = paramApellido;
		dni = paramDNI;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public String getDNI(){
		return dni;
	}
}
