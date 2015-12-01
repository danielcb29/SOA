package lib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase Multa, permite relacionar las demas clases y asignar una fecha y valor a la infraccion 
 * Informacion basica, gets y sets 
 * @author Daniel Correa Barrios
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Multa", propOrder = {
    "coche",
    "valor",
    "infractor",
    "mes"
})
public class Multa {
	
	@XmlElement(required = true)
	private Vehiculo coche;
	@XmlElement(required = true)
	private Integer valor; 
	@XmlElement(required = true)
	private Propietario infractor;
	@XmlElement(required = true)
	private String mes;
	
	public Multa(Vehiculo paramCoche,Integer paramValor,Propietario paramPropietario, String paramMes){
		coche = paramCoche;
		valor = paramValor;
		infractor = paramPropietario;
		mes = paramMes;
	}
	
	public Vehiculo getCoche(){
		return coche;
	}
	
	public Integer getValor(){
		return valor;
	}
	
	public Propietario getPropietario(){
		return infractor;
	}
	
	public String getMes(){
		return mes;
	}
	
	public void setCoche(Vehiculo coche){
		this.coche = coche;
	}
	
	public void setValor(Integer valor){
		this.valor = valor;
	}
	
	public void setPropietario(Propietario infractor){
		this.infractor = infractor;
	}
	
	public void setMes(String mes){
		this.mes = mes;
	}
}
