package lib;
import org.osoa.sca.annotations.Init;
import org.osoa.sca.annotations.Property;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Scope;
import org.osoa.sca.annotations.Service;
import api.*;

@Service(MultasService.class) //Se especifica que su servicio sera la interfaz MultaService
@Scope("COMPOSITE") //Se especifica que el envio de datos sera como una composicion
public class MultasServiceImp implements MultasService{
	
	//Propiedad nombre ventana
	@Property
	protected String nombreVentana;
	//Ventana para despliegue de invocaciones
	private Ventana v=null;
	
	//Instancias de los servicios, se etiquetan para poder especificarlos en el diagrama
	@Reference
	protected DetalleMulta detalleService;
	@Reference
	protected ConsultaMulta consultaService;
	@Reference
	protected PropietarioMulta propietarioService;
	
	@Init
	public void init(){
		v = new Ventana("Servidor Multas Web SCA " +nombreVentana);//Se inicializa la ventana que muestra la invocacion de los metodos
	}
	
	
	//Implementacion del metodo consultaMulta, por medio de este se podra acceder al metodo del componente ConsultaMultaComponent
	public boolean consultaMulta(String placa){
		String name = new Object(){}.getClass().getEnclosingMethod().getName(); //Se obtiene el nombre del metodo
		v.addText("Peticion de invocación a método ---> " + name + " implementado en Java\n" ); //Se informa la invocacion del metodo
		return consultaService.consultaMulta(placa); //Se retorna el valor de la ejecucion del metodo original
	}
	
	//Implementacion del metodo detalleMulta, por medio de este se podra acceder al metodo del componenete DetalleMultaComponent
	public String detalleMulta(String dni , String mes){
		String name = new Object(){}.getClass().getEnclosingMethod().getName();//Se obtiene el nombre del metodo
		v.addText("Peticion de invocación a método ---> " + name + " implementado en Java\n" );//Se informa la invocacion del metodo
		return detalleService.detalleMulta(dni, mes);//Se retorna el valor de la ejecucion del metodo original
	}
	
	//Implementacion del metodo propietarioMulta, por medio de este se podra acceder al metodo del componenete PropietarioMultaComponent
	public String propietarioMulta(String mes,String placa){
		String name = new Object(){}.getClass().getEnclosingMethod().getName();//Se obtiene el nombre del metodo
		v.addText("Peticion de invocación a método ---> " + name + " implementado en Java\n" );//Se informa la invocacion del metodo
		return propietarioService.propietarioMulta(mes, placa);//Se retorna el valor de la ejecucion del metodo original
	}
	
	

}
