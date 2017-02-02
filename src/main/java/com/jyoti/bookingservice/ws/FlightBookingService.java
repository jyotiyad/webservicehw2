package com.jyoti.bookingservice.ws;

import com.jyoti.bookingservice.flight.FlightService;
import com.jyoti.bookingservice.flight.Itinerary;
import com.jyoti.bookingservice.flight.Ticket;
import com.jyoti.bookingservice.auth.AuthenticationException;
import com.jyoti.bookingservice.auth.AuthenticationService;

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

    public String login(String username, String password) throws AuthenticationException {
        boolean isAuthenticated = authService.authenticateUser(username, password);
        if (isAuthenticated) {
            String token = authService.generateToken();
            return token;
        } else {
            throw new AuthenticationException("Invalid username and password");
        }
    }

    public Set<Itinerary> searchItinerary(String token, String departureCity, String destinationCity) throws AuthenticationException {
        boolean tokenValid = authService.validateToken(token);
        if (!tokenValid) {
            throw new AuthenticationException("Invalid Token");
        }

        return flightService.searchFlights(departureCity, destinationCity);
    }

    public String bookTicket(String token, String travellerFullName,
                             String creditCardNumber, Itinerary itinerary) throws AuthenticationException {
        boolean tokenValid = authService.validateToken(token);
        if (!tokenValid) {
            throw new AuthenticationException("Invalid Token");
        }

        //TODO: book ticket, update inventry and return ticket number

        return "TICKET";
    }

    public Ticket createTicket(String token, String ticketNumber) throws AuthenticationException {
        boolean tokenValid = authService.validateToken(token);
        if (!tokenValid) {
            throw new AuthenticationException("Invalid Token");
        }

        //TODO: create ticket

        return null;
    }
}
