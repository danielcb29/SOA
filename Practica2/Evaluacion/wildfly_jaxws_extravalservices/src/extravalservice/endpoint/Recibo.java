package extravalservice.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 * Clase Recibo de un Cliente
 * @author M.Angel Holgado Ceballos
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	    "idSocio",
	    "numeroParticipaciones",
	    "idRecivo",
	    "importe",
	    "estado"
	})
@XmlRootElement(name = "recibo")
public class Recibo {
	
	@XmlElement(name = "idSocio", required = true)
	private String idSocio;
	@XmlElement(name = "numeroParticipaciones", required = true)
	private int numeroParticipaciones;
	@XmlElement(name = "idRecivo", required = true)
	private String idRecivo;
	@XmlElement(name = "importe", required = true)
	private String importe;
	@XmlElement(name = "estado", required = true)
	private String estado;
	
	public Recibo(){
		
	}
	
	public Recibo(String idSocio, int numeroParticipaciones, String idRecivo,
			String importe, String estado) {
		this.idSocio = idSocio;
		this.numeroParticipaciones = numeroParticipaciones;
		this.idRecivo = idRecivo;
		this.importe = importe;
		this.estado = estado;
	}
	public String getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}
	public int getNumeroParticipaciones() {
		return numeroParticipaciones;
	}
	public void setNumeroParticipaciones(int numeroParticipaciones) {
		this.numeroParticipaciones = numeroParticipaciones;
	}
	public String getIdRecivo() {
		return idRecivo;
	}
	public void setIdRecivo(String idRecivo) {
		this.idRecivo = idRecivo;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Recibo [idSocio=" + idSocio + ", numeroParticipaciones="
				+ numeroParticipaciones + ", idRecivo=" + idRecivo
				+ ", importe=" + importe + ", estado=" + estado + "]";
	}
	
	
}
