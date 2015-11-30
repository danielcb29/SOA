package test;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import lib.Ventana;
import api.MultasService;

public class MultasWebClientRMI {
	public static void main(String[] args) {
		Ventana v = new Ventana("Cliente RMI de Multas Web SCA");
		String host ;
		String port ;
		String nameService;
		Boolean resultConsulta;
		String resultDetalle;
		String resultPropietario;
		try {
	           host = args[0];
	    } catch (ArrayIndexOutOfBoundsException e) {
	              host="localhost";
	    }
		
	    try {
	           port = args[1];
	    } catch (ArrayIndexOutOfBoundsException e) {
	              port="1099";
	    }
	    try {
	           nameService = args[2];
	    } catch (ArrayIndexOutOfBoundsException e) {
	              nameService="multasWebRMIService";
	    }
		try {
			
			
			/* Se obtiene de forma remota una instancia del servicio CalculatorService */
			Registry registry = LocateRegistry.getRegistry(host, Integer.parseInt(port));
			MultasService MultasServiceObj = (MultasService) registry.lookup( nameService);
			
			resultConsulta=MultasServiceObj.consultaMulta("ZNL538");
			v.addText("Consulta Multa:\n");
			v.addText("Entrada: ZNL538 -  Salida:"+resultConsulta+"\n");
			
			
			resultPropietario=MultasServiceObj.propietarioMulta("Mayo","CFN150");
			v.addText("Propietario Multa:\n");
			v.addText("Entrada: Mayo,CFN150 -  Salida:"+resultPropietario+"\n");
			
			resultDetalle=MultasServiceObj.detalleMulta("1144340675", "Abril");
			v.addText("Detalle Multa:\n");
			v.addText("Entrada: 1144340675,Abril -  Salida:"+resultDetalle+"\n");
			

		} catch (RemoteException e) {
			System.out.println(e.toString());
		} catch (NotBoundException e) {
			System.out.println(e.toString());
		}
	}
}
