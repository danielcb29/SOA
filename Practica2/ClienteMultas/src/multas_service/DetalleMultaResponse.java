
package multas_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleMultaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleMultaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="return1" type="{http://multas_service/}propietario" minOccurs="0"/>
 *         &lt;element name="return2" type="{http://multas_service/}vehiculo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleMultaResponse", propOrder = {
    "return0",
    "return1",
    "return2"
})
public class DetalleMultaResponse {

    protected Integer return0;
    protected Propietario return1;
    protected Vehiculo return2;

    /**
     * Obtiene el valor de la propiedad return0.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturn0() {
        return return0;
    }

    /**
     * Define el valor de la propiedad return0.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturn0(Integer value) {
        this.return0 = value;
    }

    /**
     * Obtiene el valor de la propiedad return1.
     * 
     * @return
     *     possible object is
     *     {@link Propietario }
     *     
     */
    public Propietario getReturn1() {
        return return1;
    }

    /**
     * Define el valor de la propiedad return1.
     * 
     * @param value
     *     allowed object is
     *     {@link Propietario }
     *     
     */
    public void setReturn1(Propietario value) {
        this.return1 = value;
    }

    /**
     * Obtiene el valor de la propiedad return2.
     * 
     * @return
     *     possible object is
     *     {@link Vehiculo }
     *     
     */
    public Vehiculo getReturn2() {
        return return2;
    }

    /**
     * Define el valor de la propiedad return2.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehiculo }
     *     
     */
    public void setReturn2(Vehiculo value) {
        this.return2 = value;
    }

}
