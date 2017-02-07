
package com.jyoti.ws.clientTopDown;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jyoti.ws.clientTopDown package. 
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

    private final static QName _CheckAvailableResponse_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "checkAvailableResponse");
    private final static QName _IssueTicketResponse_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "issueTicketResponse");
    private final static QName _GetPrice_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "getPrice");
    private final static QName _CheckAvailable_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "checkAvailable");
    private final static QName _TicketNotFoundException_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "TicketNotFoundException");
    private final static QName _IssueTicket_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "issueTicket");
    private final static QName _GetPriceResponse_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "getPriceResponse");
    private final static QName _AuthenticationException_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "AuthenticationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jyoti.ws.clientTopDown
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IssueTicket }
     * 
     */
    public IssueTicket createIssueTicket() {
        return new IssueTicket();
    }

    /**
     * Create an instance of {@link TicketNotFoundException }
     * 
     */
    public TicketNotFoundException createTicketNotFoundException() {
        return new TicketNotFoundException();
    }

    /**
     * Create an instance of {@link AuthenticationException }
     * 
     */
    public AuthenticationException createAuthenticationException() {
        return new AuthenticationException();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link CheckAvailableResponse }
     * 
     */
    public CheckAvailableResponse createCheckAvailableResponse() {
        return new CheckAvailableResponse();
    }

    /**
     * Create an instance of {@link IssueTicketResponse }
     * 
     */
    public IssueTicketResponse createIssueTicketResponse() {
        return new IssueTicketResponse();
    }

    /**
     * Create an instance of {@link CheckAvailable }
     * 
     */
    public CheckAvailable createCheckAvailable() {
        return new CheckAvailable();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "checkAvailableResponse")
    public JAXBElement<CheckAvailableResponse> createCheckAvailableResponse(CheckAvailableResponse value) {
        return new JAXBElement<CheckAvailableResponse>(_CheckAvailableResponse_QNAME, CheckAvailableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "issueTicketResponse")
    public JAXBElement<IssueTicketResponse> createIssueTicketResponse(IssueTicketResponse value) {
        return new JAXBElement<IssueTicketResponse>(_IssueTicketResponse_QNAME, IssueTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "getPrice")
    public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
        return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "checkAvailable")
    public JAXBElement<CheckAvailable> createCheckAvailable(CheckAvailable value) {
        return new JAXBElement<CheckAvailable>(_CheckAvailable_QNAME, CheckAvailable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "TicketNotFoundException")
    public JAXBElement<TicketNotFoundException> createTicketNotFoundException(TicketNotFoundException value) {
        return new JAXBElement<TicketNotFoundException>(_TicketNotFoundException_QNAME, TicketNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "issueTicket")
    public JAXBElement<IssueTicket> createIssueTicket(IssueTicket value) {
        return new JAXBElement<IssueTicket>(_IssueTicket_QNAME, IssueTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "getPriceResponse")
    public JAXBElement<GetPriceResponse> createGetPriceResponse(GetPriceResponse value) {
        return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME, GetPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "AuthenticationException")
    public JAXBElement<AuthenticationException> createAuthenticationException(AuthenticationException value) {
        return new JAXBElement<AuthenticationException>(_AuthenticationException_QNAME, AuthenticationException.class, null, value);
    }

}
