
package ws.webserv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.webserv package. 
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

    private final static QName _ColToDol_QNAME = new QName("http://webserv.com/", "colToDol");
    private final static QName _ColToDolResponse_QNAME = new QName("http://webserv.com/", "colToDolResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.webserv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ColToDol }
     * 
     */
    public ColToDol createColToDol() {
        return new ColToDol();
    }

    /**
     * Create an instance of {@link ColToDolResponse }
     * 
     */
    public ColToDolResponse createColToDolResponse() {
        return new ColToDolResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColToDol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserv.com/", name = "colToDol")
    public JAXBElement<ColToDol> createColToDol(ColToDol value) {
        return new JAXBElement<ColToDol>(_ColToDol_QNAME, ColToDol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColToDolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserv.com/", name = "colToDolResponse")
    public JAXBElement<ColToDolResponse> createColToDolResponse(ColToDolResponse value) {
        return new JAXBElement<ColToDolResponse>(_ColToDolResponse_QNAME, ColToDolResponse.class, null, value);
    }

}
