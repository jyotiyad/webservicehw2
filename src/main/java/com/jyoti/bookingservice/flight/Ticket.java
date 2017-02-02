package com.jyoti.bookingservice.flight;

import java.util.Set;

public class Ticket {
    private String ticketNumber;
    private Double totalPrice;
    private String departureCity;
    private String destinationCity;
    private Set<Flight> flights;

    public Ticket() {
    }

    public Ticket(String ticketNumber, Double totalPrice, String departureCity, String destinationCity, Set<Flight> flights) {
        this.ticketNumber = ticketNumber;
        this.totalPrice = totalPrice;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.flights = flights;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
