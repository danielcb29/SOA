package api;
import org.osoa.sca.annotations.Remotable;
/**
 * Interfaz para el componente DetalleMultaComponent
 * @author Daniel Correa Barrios 
 *
 */
@Remotable //Se especifica que sera accesible desde afuera 
public interface DetalleMulta {
	
	public String detalleMulta(String dni , String mes); //Metodo que se implementara
	
}
