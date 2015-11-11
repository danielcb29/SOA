package extravalservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * 
 * @author M.Angel Holgado Ceballos
 * Este servicio devuelve el recibo con el importe a pagar por
 * el cliente de EXTRAVAL por las participaciones adquiridas
 */
@WebService
public class AOS_Extraval_FormalizarReciboParticipacionesSocio {
	
	public AOS_Extraval_FormalizarReciboParticipacionesSocio(){
		
	}
	/**
	 * Metodo que devuelve el recibo.
	 * @param idSocio (String) identificador del socio
	 * @param numeroParticipaciones (int) numero de participaciones a acquirir
	 * @param idRecivo (String) identificador del recivo
	 * @return reciboSocio (Recibo)
	 */
	@WebMethod
	public Recibo getReciboParticipacionesSocio(String idSocio, int numeroParticipaciones, String idRecivo){
		String importe=null;
		importe=String.valueOf(numeroParticipaciones*232);
		String estado="expedido";
		Recibo reciboSocio= new Recibo(idSocio, numeroParticipaciones, idRecivo, importe, estado);
		return reciboSocio;
	}
}
