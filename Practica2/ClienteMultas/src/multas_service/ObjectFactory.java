
package multas_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the multas_service package. 
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

    private final static QName _ConsultaMultaResponse_QNAME = new QName("http://multas_service/", "consultaMultaResponse");
    private final static QName _ConsultaMultaMeses_QNAME = new QName("http://multas_service/", "consultaMultaMeses");
    private final static QName _PropietarioMultaResponse_QNAME = new QName("http://multas_service/", "propietarioMultaResponse");
    private final static QName _PropietarioMulta_QNAME = new QName("http://multas_service/", "propietarioMulta");
    private final static QName _DetalleMultaResponse_QNAME = new QName("http://multas_service/", "detalleMultaResponse");
    private final static QName _ConsultaMulta_QNAME = new QName("http://multas_service/", "consultaMulta");
    private final static QName _DetalleMulta_QNAME = new QName("http://multas_service/", "detalleMulta");
    private final static QName _ConsultaMultaMesesResponse_QNAME = new QName("http://multas_service/", "consultaMultaMesesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: multas_service
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
     * Create an instance of {@link ConsultaMultaMeses }
     * 
     */
    public ConsultaMultaMeses createConsultaMultaMeses() {
        return new ConsultaMultaMeses();
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
     * Create an instance of {@link ConsultaMultaMesesResponse }
     * 
     */
    public ConsultaMultaMesesResponse createConsultaMultaMesesResponse() {
        return new ConsultaMultaMesesResponse();
    }

    /**
     * Create an instance of {@link Propietario }
     * 
     */
    public Propietario createPropietario() {
        return new Propietario();
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "consultaMultaResponse")
    public JAXBElement<ConsultaMultaResponse> createConsultaMultaResponse(ConsultaMultaResponse value) {
        return new JAXBElement<ConsultaMultaResponse>(_ConsultaMultaResponse_QNAME, ConsultaMultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMultaMeses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "consultaMultaMeses")
    public JAXBElement<ConsultaMultaMeses> createConsultaMultaMeses(ConsultaMultaMeses value) {
        return new JAXBElement<ConsultaMultaMeses>(_ConsultaMultaMeses_QNAME, ConsultaMultaMeses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropietarioMultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "propietarioMultaResponse")
    public JAXBElement<PropietarioMultaResponse> createPropietarioMultaResponse(PropietarioMultaResponse value) {
        return new JAXBElement<PropietarioMultaResponse>(_PropietarioMultaResponse_QNAME, PropietarioMultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropietarioMulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "propietarioMulta")
    public JAXBElement<PropietarioMulta> createPropietarioMulta(PropietarioMulta value) {
        return new JAXBElement<PropietarioMulta>(_PropietarioMulta_QNAME, PropietarioMulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleMultaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "detalleMultaResponse")
    public JAXBElement<DetalleMultaResponse> createDetalleMultaResponse(DetalleMultaResponse value) {
        return new JAXBElement<DetalleMultaResponse>(_DetalleMultaResponse_QNAME, DetalleMultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "consultaMulta")
    public JAXBElement<ConsultaMulta> createConsultaMulta(ConsultaMulta value) {
        return new JAXBElement<ConsultaMulta>(_ConsultaMulta_QNAME, ConsultaMulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleMulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "detalleMulta")
    public JAXBElement<DetalleMulta> createDetalleMulta(DetalleMulta value) {
        return new JAXBElement<DetalleMulta>(_DetalleMulta_QNAME, DetalleMulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaMultaMesesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://multas_service/", name = "consultaMultaMesesResponse")
    public JAXBElement<ConsultaMultaMesesResponse> createConsultaMultaMesesResponse(ConsultaMultaMesesResponse value) {
        return new JAXBElement<ConsultaMultaMesesResponse>(_ConsultaMultaMesesResponse_QNAME, ConsultaMultaMesesResponse.class, null, value);
    }

}
