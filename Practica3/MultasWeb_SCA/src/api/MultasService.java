package api;
import org.osoa.sca.annotations.Remotable;

@Remotable

public interface MultasService {
	public boolean consultaMulta(String placa);
	public String detalleMulta(String dni , String mes);
	public String propietarioMulta(String mes,String placa);
	
}
