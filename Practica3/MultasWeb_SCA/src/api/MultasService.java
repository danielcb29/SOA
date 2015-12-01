package api;
import org.osoa.sca.annotations.Remotable;
/**
 * Interfaz para el componenete principal MultasWebComponent. 
 * Esta interfaz implementara los metodos de los otros componentes para hacer llamado mediante referencias
 * @author Daniel Correa Barrios
 *
 */

@Remotable  //Se especifica que sera accesible desde afuera
public interface MultasService {
	public boolean consultaMulta(String placa); //Metodo que se implementara
	public String detalleMulta(String dni , String mes); //Metodo que se implementara
	public String propietarioMulta(String mes,String placa); //Metodo que se implementara
	
}
