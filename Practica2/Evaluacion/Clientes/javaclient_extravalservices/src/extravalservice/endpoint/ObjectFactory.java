
package extravalservice.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the extravalservice.endpoint package. 
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

    private final static QName _GetReciboParticipacionesSocioResponse_QNAME = new QName("http://endpoint.extravalservice/", "getReciboParticipacionesSocioResponse");
    private final static QName _GetReciboParticipacionesSocio_QNAME = new QName("http://endpoint.extravalservice/", "getReciboParticipacionesSocio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: extravalservice.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReciboParticipacionesSocioResponse }
     * 
     */
    public GetReciboParticipacionesSocioResponse createGetReciboParticipacionesSocioResponse() {
        return new GetReciboParticipacionesSocioResponse();
    }

    /**
     * Create an instance of {@link GetReciboParticipacionesSocio }
     * 
     */
    public GetReciboParticipacionesSocio createGetReciboParticipacionesSocio() {
        return new GetReciboParticipacionesSocio();
    }

    /**
     * Create an instance of {@link Recibo }
     * 
     */
    public Recibo createRecibo() {
        return new Recibo();
    }

    /**
     * Create an instance of {@link GetReciboParticipacionesSocioResponse.Return }
     * 
     */
    public GetReciboParticipacionesSocioResponse.Return createGetReciboParticipacionesSocioResponseReturn() {
        return new GetReciboParticipacionesSocioResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReciboParticipacionesSocioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.extravalservice/", name = "getReciboParticipacionesSocioResponse")
    public JAXBElement<GetReciboParticipacionesSocioResponse> createGetReciboParticipacionesSocioResponse(GetReciboParticipacionesSocioResponse value) {
        return new JAXBElement<GetReciboParticipacionesSocioResponse>(_GetReciboParticipacionesSocioResponse_QNAME, GetReciboParticipacionesSocioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReciboParticipacionesSocio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.extravalservice/", name = "getReciboParticipacionesSocio")
    public JAXBElement<GetReciboParticipacionesSocio> createGetReciboParticipacionesSocio(GetReciboParticipacionesSocio value) {
        return new JAXBElement<GetReciboParticipacionesSocio>(_GetReciboParticipacionesSocio_QNAME, GetReciboParticipacionesSocio.class, null, value);
    }

}
