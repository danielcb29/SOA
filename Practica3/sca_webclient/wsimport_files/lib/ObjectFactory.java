
package lib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lib package. 
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

    private final static QName _DetalleMultaResponse_QNAME = new QName("http://lib/", "detalleMultaResponse");
    private final static QName _DetalleMulta_QNAME = new QName("http://lib/", "detalleMulta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lib
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DetalleMultaResponse }
     * 
     */
    public DetalleMultaResponse createDetalleMultaResponse() {
        return new DetalleMultaResponse();
    }

    /**
     * Create an instance of {@link DetalleMulta }
     * 
     */
    public DetalleMulta createDetalleMulta() {
        return new DetalleMulta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleMultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lib/", name = "detalleMultaResponse")
    public JAXBElement<DetalleMultaResponse> createDetalleMultaResponse(DetalleMultaResponse value) {
        return new JAXBElement<DetalleMultaResponse>(_DetalleMultaResponse_QNAME, DetalleMultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleMulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lib/", name = "detalleMulta")
    public JAXBElement<DetalleMulta> createDetalleMulta(DetalleMulta value) {
        return new JAXBElement<DetalleMulta>(_DetalleMulta_QNAME, DetalleMulta.class, null, value);
    }

}
