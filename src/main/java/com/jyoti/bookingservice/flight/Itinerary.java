package com.jyoti.bookingservice.flight;

import java.util.Set;

public class Itinerary {

    private String departureCity;
    private String destinationCity;
    private Set<Flight> flights;

    public Itinerary() {
    }

    public Itinerary(String departureCity, String destinationCity, Set<Flight> flights) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.flights = flights;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }
}
