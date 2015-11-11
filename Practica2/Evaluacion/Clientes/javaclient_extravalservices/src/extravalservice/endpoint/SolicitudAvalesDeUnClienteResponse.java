
package extravalservice.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para solicitudAvalesDeUnClienteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudAvalesDeUnClienteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="solicitudAvales" type="{http://endpoint.extravalservice/}ArrayOfSolicitud" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudAvalesDeUnClienteResponse", propOrder = {
    "solicitudAvales"
})
public class SolicitudAvalesDeUnClienteResponse {

    protected ArrayOfSolicitud solicitudAvales;

    /**
     * Obtiene el valor de la propiedad solicitudAvales.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSolicitud }
     *     
     */
    public ArrayOfSolicitud getSolicitudAvales() {
        return solicitudAvales;
    }

    /**
     * Define el valor de la propiedad solicitudAvales.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSolicitud }
     *     
     */
    public void setSolicitudAvales(ArrayOfSolicitud value) {
        this.solicitudAvales = value;
    }

}
