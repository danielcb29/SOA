
package api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DetalleMultaArg1_QNAME = new QName("", "arg1");
    private final static QName _DetalleMultaArg0_QNAME = new QName("", "arg0");
    private final static QName _DetalleMultaResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropietarioMultaResponse }
     * 
     */
    public PropietarioMultaResponse createPropietarioMultaResponse() {
        return new PropietarioMultaResponse();
    }

    /**
     * Create an instance of {@link ConsultaMultaResponse }
     * 
     */
    public ConsultaMultaResponse createConsultaMultaResponse() {
        return new ConsultaMultaResponse();
    }

    /**
     * Create an instance of {@link DetalleMultaResponse }
     * 
     */
    public DetalleMultaResponse createDetalleMultaResponse() {
        return new DetalleMultaResponse();
    }

    /**
     * Create an instance of {@link PropietarioMulta }
     * 
     */
    public PropietarioMulta createPropietarioMulta() {
        return new PropietarioMulta();
    }

    /**
     * Create an instance of {@link ConsultaMulta }
     * 
     */
    public ConsultaMulta createConsultaMulta() {
        return new ConsultaMulta();
    }

    /**
     * Create an instance of {@link DetalleMulta }
     * 
     */
    public DetalleMulta createDetalleMulta() {
        return new DetalleMulta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = DetalleMulta.class)
    public JAXBElement<String> createDetalleMultaArg1(String value) {
        return new JAXBElement<String>(_DetalleMultaArg1_QNAME, String.class, DetalleMulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = DetalleMulta.class)
    public JAXBElement<String> createDetalleMultaArg0(String value) {
        return new JAXBElement<String>(_DetalleMultaArg0_QNAME, String.class, DetalleMulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = DetalleMultaResponse.class)
    public JAXBElement<String> createDetalleMultaResponseReturn(String value) {
        return new JAXBElement<String>(_DetalleMultaResponseReturn_QNAME, String.class, DetalleMultaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = PropietarioMultaResponse.class)
    public JAXBElement<String> createPropietarioMultaResponseReturn(String value) {
        return new JAXBElement<String>(_DetalleMultaResponseReturn_QNAME, String.class, PropietarioMultaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = PropietarioMulta.class)
    public JAXBElement<String> createPropietarioMultaArg1(String value) {
        return new JAXBElement<String>(_DetalleMultaArg1_QNAME, String.class, PropietarioMulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = PropietarioMulta.class)
    public JAXBElement<String> createPropietarioMultaArg0(String value) {
        return new JAXBElement<String>(_DetalleMultaArg0_QNAME, String.class, PropietarioMulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = ConsultaMulta.class)
    public JAXBElement<String> createConsultaMultaArg0(String value) {
        return new JAXBElement<String>(_DetalleMultaArg0_QNAME, String.class, ConsultaMulta.class, value);
    }

}
