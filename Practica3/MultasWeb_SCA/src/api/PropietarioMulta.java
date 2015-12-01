package api;
import org.osoa.sca.annotations.Remotable;
/**
 * Interfaz para el componente PropietarioMultaComponent
 * @author Daniel Correa Barrios
 *
 */
@Remotable  //Se especifica que sera accesible desde afuera 
public interface PropietarioMulta {
	
	public String propietarioMulta(String mes,String placa); //Metodo que se implementara
	
}
