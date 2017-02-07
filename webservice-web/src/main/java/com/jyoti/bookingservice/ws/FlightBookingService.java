package com.jyoti.bookingservice.ws;

import com.jyoti.bookingservice.auth.AuthenticationException;
import com.jyoti.bookingservice.auth.AuthenticationService;
import com.jyoti.bookingservice.flight.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Set;

@WebService
public class FlightBookingService {

    private AuthenticationService authService;
    private FlightService flightService;

    public FlightBookingService() {
        this.authService = new AuthenticationService();
        this.flightService = new FlightService();
    }

    @WebMethod
    public String login(@WebParam(name = "username") String username,
                        @WebParam(name = "password") String password) throws AuthenticationException {
        boolean isAuthenticated = authService.authenticateUser(username, password);
        if (isAuthenticated) {
            String token = authService.generateToken();
            return token;
        } else {
            throw new AuthenticationException("Invalid username and password");
        }
    }

    @WebMethod
    public Set<Itinerary> searchItinerary(@WebParam(name = "token") String token,
                                          @WebParam(name = "departureCity") String departureCity,
                                          @WebParam(name = "destinationCity") String destinationCity) throws AuthenticationException {
        boolean tokenValid = authService.validateToken(token);
        if (!tokenValid) {
            throw new AuthenticationException("Invalid Token");
        }

        return flightService.searchFlights(departureCity, destinationCity);
    }

    @WebMethod
    public Set<Itinerary> searchAvailableItinerary(@WebParam(name = "token") String token,
                                                   @WebParam(name = "departureCity") String departureCity,
                                                   @WebParam(name = "destinationCity") String destinationCity,
                                                   @WebParam(name = "date") String date) throws AuthenticationException {
        boolean tokenValid = authService.validateToken(token);
        if (!tokenValid) {
            throw new AuthenticationException("Invalid Token");
        }

        return flightService.searchTicketAvailableFlights(departureCity, destinationCity, date);
    }

    @WebMethod
    public String bookTicket(@WebParam(name = "token") String token,
                             @WebParam(name = "travellerFullName") String travellerFullName,
                             @WebParam(name = "creditCardNumber") String creditCardNumber,
                             @WebParam(name = "itinerary") Itinerary itinerary)
            throws AuthenticationException, SeatNotAvailableException, InvalidCardDetailsException {
        boolean tokenValid = authService.validateToken(token);
        if (!tokenValid) {
            throw new AuthenticationException("Invalid Token");
        }

        if (creditCardNumber == null || creditCardNumber.length() < 0) {
            throw new InvalidCardDetailsException("credit card number should always be provided");
        }

        String ticket = flightService.bookTicket(travellerFullName,
                creditCardNumber, itinerary);

        return ticket;
    }

    @WebMethod
    public Ticket createTicket(@WebParam(name = "token") String token,
                               @WebParam(name = "ticketNumber") String ticketNumber) throws AuthenticationException, TicketNotFoundException {
        boolean tokenValid = authService.validateToken(token);
        if (!tokenValid) {
            throw new AuthenticationException("Invalid Token");
        }

        Ticket ticket = flightService.getTicketDetails(ticketNumber);

        return ticket;
    }

}
