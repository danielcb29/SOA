
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

    private final static QName _ConsultaMultaResponse_QNAME = new QName("http://lib/", "consultaMultaResponse");
    private final static QName _ConsultaMulta_QNAME = new QName("http://lib/", "consultaMulta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lib
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaMultaResponse }
     * 
     */
    public ConsultaMultaResponse createConsultaMultaResponse() {
        return new ConsultaMultaResponse();
    }

    /**
     * Create an instance of {@link ConsultaMulta }
     * 
     */
    public ConsultaMulta createConsultaMulta() {
        return new ConsultaMulta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lib/", name = "consultaMultaResponse")
    public JAXBElement<ConsultaMultaResponse> createConsultaMultaResponse(ConsultaMultaResponse value) {
        return new JAXBElement<ConsultaMultaResponse>(_ConsultaMultaResponse_QNAME, ConsultaMultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lib/", name = "consultaMulta")
    public JAXBElement<ConsultaMulta> createConsultaMulta(ConsultaMulta value) {
        return new JAXBElement<ConsultaMulta>(_ConsultaMulta_QNAME, ConsultaMulta.class, null, value);
    }

}
