
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

    private final static QName _PropietarioMulta_QNAME = new QName("http://lib/", "propietarioMulta");
    private final static QName _PropietarioMultaResponse_QNAME = new QName("http://lib/", "propietarioMultaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lib
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
     * Create an instance of {@link PropietarioMulta }
     * 
     */
    public PropietarioMulta createPropietarioMulta() {
        return new PropietarioMulta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropietarioMulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lib/", name = "propietarioMulta")
    public JAXBElement<PropietarioMulta> createPropietarioMulta(PropietarioMulta value) {
        return new JAXBElement<PropietarioMulta>(_PropietarioMulta_QNAME, PropietarioMulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropietarioMultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lib/", name = "propietarioMultaResponse")
    public JAXBElement<PropietarioMultaResponse> createPropietarioMultaResponse(PropietarioMultaResponse value) {
        return new JAXBElement<PropietarioMultaResponse>(_PropietarioMultaResponse_QNAME, PropietarioMultaResponse.class, null, value);
    }

}
