package multas_service;
/**
 * Clase Propietario, informacion basica, metodo constructor y gets
 * @author daniel
 *
 */
public class Propietario {
	private String nombre;
	private String apellido; 
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
