
package extravalservice.endpoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Solicitud" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idAval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="idSolicitante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSolicitud", propOrder = {
    "solicitud"
})
public class ArrayOfSolicitud {

    @XmlElement(name = "Solicitud", nillable = true)
    protected List<ArrayOfSolicitud.Solicitud> solicitud;

    /**
     * Gets the value of the solicitud property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitud property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitud().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfSolicitud.Solicitud }
     * 
     * 
     */
    public List<ArrayOfSolicitud.Solicitud> getSolicitud() {
        if (solicitud == null) {
            solicitud = new ArrayList<ArrayOfSolicitud.Solicitud>();
        }
        return this.solicitud;
    }


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
     *         &lt;element name="idAval" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="idSolicitante" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "idAval",
        "idSolicitante",
        "estado"
    })
    public static class Solicitud {

        protected int idAval;
        protected int idSolicitante;
        @XmlElement(required = true)
        protected String estado;

        /**
         * Obtiene el valor de la propiedad idAval.
         * 
         */
        public int getIdAval() {
            return idAval;
        }

        /**
         * Define el valor de la propiedad idAval.
         * 
         */
        public void setIdAval(int value) {
            this.idAval = value;
        }

        /**
         * Obtiene el valor de la propiedad idSolicitante.
         * 
         */
        public int getIdSolicitante() {
            return idSolicitante;
        }

        /**
         * Define el valor de la propiedad idSolicitante.
         * 
         */
        public void setIdSolicitante(int value) {
            this.idSolicitante = value;
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

}
