package com.jyoti.bookingservice.ws;

import com.jyoti.bookingservice.auth.AuthenticationException;
import com.jyoti.bookingservice.auth.AuthenticationService;
import com.jyoti.bookingservice.flight.FlightService;
import com.jyoti.bookingservice.flight.Ticket;
import com.jyoti.bookingservice.flight.TicketNotFoundException;
import com.jyoti.bookingservice.flight.*;

import javax.jws.WebService;
import java.util.Map;

/**
 * Created by lpoon2 on 2/7/2017.
 */
@WebService
public class FlightBookingService_topDown {
    private FlightService flightService;

    public FlightBookingService_topDown(){
    flightService = new FlightService();
    }
    public Ticket issueTicket(String token, String ticketNumber) throws AuthenticationException, TicketNotFoundException {

        Ticket ticket = flightService.getTicketDetails(ticketNumber);

        return ticket;
    }

    public boolean checkAvailable(Itinerary it){
        Map<Integer, FlightInventory> temp = flightService.getflightInventoryMap();
        for(Flight f : it.getFlights()){
            FlightInventory in = temp.get(f.getFlightId());
            if(!in.isSeatAvailable()) return false;
        }
        return true;
    }

    public Double getPrice(Itinerary it){
        return it.getTotalPrice();
    }

}
