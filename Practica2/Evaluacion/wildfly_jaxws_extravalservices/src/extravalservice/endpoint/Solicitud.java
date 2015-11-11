package extravalservice.endpoint;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
/**
 * Clase Solicitud. Para la solicitud de un aval de un cliente
 * @author M.Angel Holgado Ceballos
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	    "idAval",
	    "idSolicitante",
	    "estado"
	})
@XmlRootElement(name = "solicitud")
public class Solicitud {
	@XmlElement(name = "idAval", required = true)
	int idAval;
	@XmlElement(name = "idSolicitante", required = true)
	int idSolicitante;
	@XmlElement(name = "estado", required = true)
	String estado;

	
	public Solicitud(){
		
	}
	
	public Solicitud(int idAval, int idSolicitante){
		this.idAval=idAval;
		this.idSolicitante=idSolicitante;
	}
	
	public Solicitud(int idAval, int idSolicitante, String estadoAval) {
		this.idAval=idAval;
		this.idSolicitante=idSolicitante;
		this.estado=estadoAval;
	}

	public int getIdAval() {
		return idAval;
	}
	public void setIdAval(int idAval) {
		this.idAval = idAval;
	}
	public int getIdSolicitante() {
		return idSolicitante;
	}
	public void setIdSolicitante(int idSolicitante) {
		this.idSolicitante = idSolicitante;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Solicitud [idAval=" + idAval + ", idSolicitante="
				+ idSolicitante + ", estado=" + estado + "]";
	}
	
}
