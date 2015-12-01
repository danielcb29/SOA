package api;
import org.osoa.sca.annotations.Remotable;
/**
 * Interfaz para el componente ConsultaMultaComponent
 * @author Daniel Correa Barrios
 *
 */
@Remotable //Se especifica que sera accesible desde afuera 
public interface ConsultaMulta {
	
	public boolean consultaMulta(String placa); //Metodo que se implementara
	
}
