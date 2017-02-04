
package com.jyoti.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jyoti.client package. 
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

    private final static QName _SearchItineraryResponse_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "searchItineraryResponse");
    private final static QName _BookTicketResponse_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "bookTicketResponse");
    private final static QName _SearchItinerary_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "searchItinerary");
    private final static QName _CreateTicketResponse_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "createTicketResponse");
    private final static QName _Login_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "loginResponse");
    private final static QName _BookTicket_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "bookTicket");
    private final static QName _AuthenticationException_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "AuthenticationException");
    private final static QName _CreateTicket_QNAME = new QName("http://ws.bookingservice.jyoti.com/", "createTicket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jyoti.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link AuthenticationException }
     * 
     */
    public AuthenticationException createAuthenticationException() {
        return new AuthenticationException();
    }

    /**
     * Create an instance of {@link CreateTicket }
     * 
     */
    public CreateTicket createCreateTicket() {
        return new CreateTicket();
    }

    /**
     * Create an instance of {@link BookTicket }
     * 
     */
    public BookTicket createBookTicket() {
        return new BookTicket();
    }

    /**
     * Create an instance of {@link BookTicketResponse }
     * 
     */
    public BookTicketResponse createBookTicketResponse() {
        return new BookTicketResponse();
    }

    /**
     * Create an instance of {@link SearchItineraryResponse }
     * 
     */
    public SearchItineraryResponse createSearchItineraryResponse() {
        return new SearchItineraryResponse();
    }

    /**
     * Create an instance of {@link CreateTicketResponse }
     * 
     */
    public CreateTicketResponse createCreateTicketResponse() {
        return new CreateTicketResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link SearchItinerary }
     * 
     */
    public SearchItinerary createSearchItinerary() {
        return new SearchItinerary();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchItineraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "searchItineraryResponse")
    public JAXBElement<SearchItineraryResponse> createSearchItineraryResponse(SearchItineraryResponse value) {
        return new JAXBElement<SearchItineraryResponse>(_SearchItineraryResponse_QNAME, SearchItineraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "bookTicketResponse")
    public JAXBElement<BookTicketResponse> createBookTicketResponse(BookTicketResponse value) {
        return new JAXBElement<BookTicketResponse>(_BookTicketResponse_QNAME, BookTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchItinerary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "searchItinerary")
    public JAXBElement<SearchItinerary> createSearchItinerary(SearchItinerary value) {
        return new JAXBElement<SearchItinerary>(_SearchItinerary_QNAME, SearchItinerary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "createTicketResponse")
    public JAXBElement<CreateTicketResponse> createCreateTicketResponse(CreateTicketResponse value) {
        return new JAXBElement<CreateTicketResponse>(_CreateTicketResponse_QNAME, CreateTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "bookTicket")
    public JAXBElement<BookTicket> createBookTicket(BookTicket value) {
        return new JAXBElement<BookTicket>(_BookTicket_QNAME, BookTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "AuthenticationException")
    public JAXBElement<AuthenticationException> createAuthenticationException(AuthenticationException value) {
        return new JAXBElement<AuthenticationException>(_AuthenticationException_QNAME, AuthenticationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookingservice.jyoti.com/", name = "createTicket")
    public JAXBElement<CreateTicket> createCreateTicket(CreateTicket value) {
        return new JAXBElement<CreateTicket>(_CreateTicket_QNAME, CreateTicket.class, null, value);
    }

}
