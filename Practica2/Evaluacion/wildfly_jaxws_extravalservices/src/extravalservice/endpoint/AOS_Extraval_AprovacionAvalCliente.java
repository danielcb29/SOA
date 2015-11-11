package extravalservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;
/**
 * 
 * @author M.Angel Holgado Ceballos
 * Este servicio permite a un administrativo de EXTRAVAL cambiar el 
 * estado de un aval(aceptado, denegado, en estudio, finalizado).
 *
 */
@WebService
public class AOS_Extraval_AprovacionAvalCliente {
	
	public AOS_Extraval_AprovacionAvalCliente(){
		
	}
	/**
	 * Metodo que cambia el estado de un aval.
	 * @param idSolicitante (int) identificador del solicitante
	 * @param idAval (int) identificador del aval
	 * @param estadoAval (String) estado del aval (aceptado, denegado, en estudio, finalizado)
	 * @param solicitudAvalACambiar (Solicitud) parametro de salida
	 */
	@WebMethod
	public void cambiarEstadoAvalDeUnCliente(int idSolicitante, int idAval, String estadoAval, @WebParam(name = "solicitudAvalACambiar", mode = WebParam.Mode.OUT) Holder<Solicitud> solicitudAvalACambiar){
		// inicio creacion de datos ficticios
		Solicitud solicitud=null;
		String auxString= new String(estadoAval);
		auxString.toLowerCase().trim();
		switch (auxString) {
		case "aceptado":
			solicitud=new Solicitud(idAval, idSolicitante, estadoAval);
			break;
		case "denegado":
			solicitud=new Solicitud(idAval, idSolicitante, estadoAval);
			break;
		case "en estudio":
			solicitud=new Solicitud(idAval, idSolicitante, estadoAval);
			break;
		case "finalizado":
			solicitud=new Solicitud(idAval, idSolicitante, estadoAval);
			break;
		default:
			solicitud=new Solicitud(idAval, idSolicitante, "Ha habido algun error, uppsss!!!!!!!!!!!!");
			break;
		}
		// fin datos ficticios
		// los datos reales habria que cogerlos de la base de datos del sistema principal
		solicitudAvalACambiar.value=solicitud;
	}
}
