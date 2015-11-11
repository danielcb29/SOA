package extravalservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;
/**
 * 
 * @author M.Angel Holgado Ceballos
 * Este servicio devuelve la situacion en la que se encuentran los diferentes avales
 * de un cliente de EXTRAVAL
 *
 */
@WebService
public class AOS_Extraval_EstadoAvalesCliente {

	public AOS_Extraval_EstadoAvalesCliente() {
	}
	/**
	 * Metodo que segun el id del cliente devuelve un array con la
	 * situacion de los avales.
	 * @param idCliente (int) que identifica al cliente en la BD
	 * @param solicitudAvales (ArrayOfSolicitud) lista de la situacion de los avales del cliente.
	 * parametrod de salida.
	 */
	@WebMethod
	public void solicitudAvalesDeUnCliente(int idCliente, @WebParam(name = "solicitudAvales", mode = WebParam.Mode.OUT) Holder<ArrayOfSolicitud> solicitudAvales){
		// inicio creacion de datos ficticios
		ArrayOfSolicitud auxListaSolicitudes=new ArrayOfSolicitud();
		for (int i = 0; i < 5; i++) {
			auxListaSolicitudes.getSolicitud().add(new Solicitud(i, idCliente));
		}
		auxListaSolicitudes.getSolicitud().get(0).setEstado("Aceptado");
		auxListaSolicitudes.getSolicitud().get(1).setEstado("Denegdo");
		auxListaSolicitudes.getSolicitud().get(2).setEstado("Aceptado");
		auxListaSolicitudes.getSolicitud().get(3).setEstado("En estudio");
		auxListaSolicitudes.getSolicitud().get(4).setEstado("Finalizado");
		// fin datos ficticios
		// los datos reales habria que cogerlos de la base de datos del sistema principal
		solicitudAvales.value=auxListaSolicitudes;
	}
}
