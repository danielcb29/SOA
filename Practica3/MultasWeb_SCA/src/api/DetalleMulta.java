package api;
import org.osoa.sca.annotations.Remotable;
@Remotable

public interface DetalleMulta {
	public String detalleMulta(String dni , String mes);
}
