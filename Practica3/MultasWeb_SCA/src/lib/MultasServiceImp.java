package lib;
import org.osoa.sca.annotations.Init;
import org.osoa.sca.annotations.Property;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;
import org.osoa.sca.annotations.Service;
import api.*;

@Service(MultasService.class)
@Scope("COMPOSITE")
public class MultasServiceImp implements MultasService{
	
	@Property
	protected String nombreVentana;
	
	private Ventana v=null;
	
	//Instancias de los servicios 
	@Reference
	protected DetalleMulta detalleService;
	@Reference
	protected ConsultaMulta consultaService;
	@Reference
	protected PropietarioMulta propietarioService;
	
	@Init
	public void init(){
		v = new Ventana("Servidor Multas Web SCA " +nombreVentana);
	}
	
	
	
	public boolean consultaMulta(String placa){
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		v.addText("Peticion de invocación a método ---> " + name + " implementado en Java\n" );
		return consultaService.consultaMulta(placa);
	}
	
	public String detalleMulta(String dni , String mes){
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		v.addText("Peticion de invocación a método ---> " + name + " implementado en Java\n" );
		return detalleService.detalleMulta(dni, mes);
	}
	
	public String propietarioMulta(String mes,String placa){
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		v.addText("Peticion de invocación a método ---> " + name + " implementado en Java\n" );
		return propietarioService.propietarioMulta(mes, placa);
	}
	
	

}
