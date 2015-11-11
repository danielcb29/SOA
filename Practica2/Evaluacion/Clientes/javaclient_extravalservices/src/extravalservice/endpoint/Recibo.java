
package extravalservice.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroParticipaciones" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idRecivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSocio",
    "numeroParticipaciones",
    "idRecivo",
    "importe",
    "estado"
})
@XmlRootElement(name = "recibo")
public class Recibo {

    @XmlElement(required = true)
    protected String idSocio;
    protected int numeroParticipaciones;
    @XmlElement(required = true)
    protected String idRecivo;
    @XmlElement(required = true)
    protected String importe;
    @XmlElement(required = true)
    protected String estado;

    /**
     * Obtiene el valor de la propiedad idSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSocio() {
        return idSocio;
    }

    /**
     * Define el valor de la propiedad idSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSocio(String value) {
        this.idSocio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroParticipaciones.
     * 
     */
    public int getNumeroParticipaciones() {
        return numeroParticipaciones;
    }

    /**
     * Define el valor de la propiedad numeroParticipaciones.
     * 
     */
    public void setNumeroParticipaciones(int value) {
        this.numeroParticipaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad idRecivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRecivo() {
        return idRecivo;
    }

    /**
     * Define el valor de la propiedad idRecivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRecivo(String value) {
        this.idRecivo = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporte(String value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
