
package extravalservice.endpoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
/**
 * Clase Lista para manejar Solicitudes
 * @author M.Angel Holgado Ceballos
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSolicitud", propOrder = {
    "solicitud"
})
public class ArrayOfSolicitud {

    @XmlElement(name = "Solicitud", nillable = true)
    protected List<Solicitud> solicitud;

    
    public List<Solicitud> getSolicitud() {
        if (solicitud == null) {
        	solicitud = new ArrayList<Solicitud>();
        }
        return this.solicitud;
    }

}
