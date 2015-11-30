package test;

import lib.Ventana;

import org.apache.tuscany.sca.host.embedded.SCADomain;

import api.MultasService;

public class MultasWebClientLocal {
	public static void main(String[] args) {
		Ventana v = new Ventana("Cliente MultasWeb SCA");
		SCADomain scaDomain = SCADomain.newInstance("Multas_Web_SCA.composite");
		v.addText("\n Creada instancia del composite Calculator");
		
		/* Se obtiene una instancia del servicio (interface) HelloWorldService */
		MultasService MultasServiceObj= scaDomain.getService(MultasService.class,"MultasComponent");
		
		Boolean resultConsulta=MultasServiceObj.consultaMulta("ZNL538");
		v.addText("Consulta Multa:\n");
		v.addText("Entrada: ZNL538 -  Salida:"+resultConsulta+"\n");
		
		
		String resultPropietario=MultasServiceObj.propietarioMulta("Mayo","CFN150");
		v.addText("Propietario Multa:\n");
		v.addText("Entrada: Mayo,CFN150 -  Salida:"+resultPropietario+"\n");
		
		String resultDetalle=MultasServiceObj.detalleMulta("1144340675", "Abril");
		v.addText("Detalle Multa:\n");
		v.addText("Entrada: 1144340675,Abril -  Salida:"+resultDetalle+"\n");
		

	}
}
