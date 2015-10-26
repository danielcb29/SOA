package multas_service;

import java.util.ArrayList;
import java.util.List;

public class MultasApp {
	private static ServiciosMultaService service = new ServiciosMultaService();
	private static ServiciosMulta port = service.getServiciosMultaPort();
	
	public static void main(String[] args){
		System.out.println(port.consultaMulta("ZNL538"));
		ArrayList<String> meses = new ArrayList<String>();
		meses.add("Enero");
		meses.add("Febrero");
		List<Integer> valores = new ArrayList<Integer>();
		valores = port.consultaMultaMeses(meses, "ZNL538");
		System.out.println(valores.get(0));
		System.out.println(valores.get(1));
		
		//PropietarioMultaResponse p = port.propietarioMulta("ZNL538", "Enero");
		//Propietario p = port.propietarioMulta("ZNL538", "Enero");
		//System.out.println(p.getNombre());
	}
}