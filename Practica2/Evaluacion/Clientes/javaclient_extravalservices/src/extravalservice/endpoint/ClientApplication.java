package extravalservice.endpoint;

import java.util.List;


import extravalservice.endpoint.ArrayOfSolicitud.Solicitud;
import extravalservice.endpoint.CambiarEstadoAvalDeUnClienteResponse.SolicitudAvalACambiar;
import extravalservice.endpoint.GetReciboParticipacionesSocioResponse.Return;

public class ClientApplication {
	private static AOSExtravalEstadoAvalesClienteService seriveEstado = new AOSExtravalEstadoAvalesClienteService();
	private static AOSExtravalEstadoAvalesCliente portEstado = seriveEstado.getAOSExtravalEstadoAvalesClientePort();
	
	private static AOSExtravalAprovacionAvalClienteService serviceAprobacion = new AOSExtravalAprovacionAvalClienteService();
	private static AOSExtravalAprovacionAvalCliente portAprobacion = serviceAprobacion.getAOSExtravalAprovacionAvalClientePort();
	
	private static AOSExtravalFormalizarReciboParticipacionesSocioService serviceFormalizar = new AOSExtravalFormalizarReciboParticipacionesSocioService();
	private static AOSExtravalFormalizarReciboParticipacionesSocio portFormalizar =  serviceFormalizar.getAOSExtravalFormalizarReciboParticipacionesSocioPort();
	
	public static void main(String[] args){
		printEstadosSolicitudes();
		printAprobacionAval();
		printFormalizar();
		
	}
	
	public static void printEstadosSolicitudes(){
		ArrayOfSolicitud responseEstado = portEstado.solicitudAvalesDeUnCliente(29);
		List<Solicitud> solicitudes = responseEstado.getSolicitud();
		System.out.println("-------------------------------");
		System.out.println("Estado Avales Cliente");
		for(int i=0; i<solicitudes.size();i++){
			System.out.println("///////////////////////////////");
			System.out.println("Solicitud numero: "+solicitudes.get(i).getIdAval());
			System.out.println("Estado: " + solicitudes.get(i).getEstado());
			System.out.println("Persona que solicita: " + solicitudes.get(i).getIdSolicitante());
			System.out.println("///////////////////////////////");
		}
		System.out.println("-------------------------------");
	}
	
	public static void printAprobacionAval(){
		SolicitudAvalACambiar responseAprobacion = portAprobacion.cambiarEstadoAvalDeUnCliente(29, 1, "aceptado");
		System.out.println("-------------------------------");
		System.out.println("Aprobacion Avales Cliente");
		System.out.println("///////////////////////////////");
		System.out.println("Solicitud numero: "+responseAprobacion.getIdAval());
		System.out.println("Estado: " + responseAprobacion.getEstado());
		System.out.println("Persona que solicita: " + responseAprobacion.getIdSolicitante());
		System.out.println("///////////////////////////////");
		System.out.println("-------------------------------");
	}
	
	public static void printFormalizar(){
		Return responseFormalizar = portFormalizar.getReciboParticipacionesSocio("29", 1000, "1");
		System.out.println("-------------------------------");
		System.out.println("Formalizar Recibo Cliente");
		System.out.println("///////////////////////////////");
		System.out.println("Recibo numero: "+responseFormalizar.getIdRecivo());
		System.out.println("Socio numero: " + responseFormalizar.getIdSocio());
		System.out.println("Numero de participantes: " + responseFormalizar.getNumeroParticipaciones());
		System.out.println("Importe: " + responseFormalizar.getImporte());
		System.out.println("Estado: " + responseFormalizar.getEstado());
		System.out.println("///////////////////////////////");
		System.out.println("-------------------------------");
	}
}
