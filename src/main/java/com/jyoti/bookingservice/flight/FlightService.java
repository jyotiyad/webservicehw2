package com.jyoti.bookingservice.flight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightService {

    private Set<Flight> flights;
    private Map<Integer, FlightInventory> flightInventoryMap;
    private String[] source = {"stockholm", "malmo", "copenhagen", "paris", "berlin"};
    private String[] destination = {"paris", "copenhagen", "malmo", "stockholm", "goteborg"};

    public FlightService() {
        flights = new HashSet<>();
        flightInventoryMap = new HashMap<>();
        int i = 0;
        Flight flight1 = new Flight(i, source[i], destination[i], "1", "1", "2017", 1111d);
        ++i;
        Flight flight2 = new Flight(i, source[i], destination[i], "2", "2", "2017", 2222d);
        ++i;
        Flight flight3 = new Flight(i, source[i], destination[i], "3", "3", "2017", 3333d);
        ++i;
        Flight flight4 = new Flight(i, source[i], destination[i], "4", "4", "2017", 4444d);
        ++i;
        Flight flight5 = new Flight(i, source[i], destination[i], "4", "4", "2017", 5555d);

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);

        flightInventoryMap.put(flight1.getFlightId(), new FlightInventory(flight1.getFlightId(), 10));
        flightInventoryMap.put(flight2.getFlightId(), new FlightInventory(flight2.getFlightId(), 10));
        flightInventoryMap.put(flight3.getFlightId(), new FlightInventory(flight3.getFlightId(), 10));
        flightInventoryMap.put(flight4.getFlightId(), new FlightInventory(flight4.getFlightId(), 10));
        flightInventoryMap.put(flight5.getFlightId(), new FlightInventory(flight5.getFlightId(), 10));
    }

    public Set<Itinerary> searchFlights(String departureCity, String destinationCity) {
        Set<Itinerary> itinerarySearchResult = new HashSet<>();
        for (Flight flight : flights) {
            if (flight.getDepartureCity().equals(departureCity)
                    && flight.getDestinationCity().equals(destinationCity)) {
                Set<Flight> flightSearchResult = new HashSet<>();
                flightSearchResult.add(flight);
                Itinerary itinerary = new Itinerary(departureCity, destinationCity, flightSearchResult);
                itinerarySearchResult.add(itinerary);
            }
        }

        //if no direct flight found then try combination flight
        if (itinerarySearchResult.isEmpty()) {
            for (Flight flight1 : flights) {
                if (flight1.getDepartureCity().equals(departureCity)) {
                    for (Flight flight2 : flights) {
                        if (flight2.getDestinationCity().equals(destinationCity)
                                && flight2.getDepartureCity().equals(flight1.getDestinationCity())) {
                            Set<Flight> flightSearchResult = new HashSet<>();
                            flightSearchResult.add(flight1);
                            flightSearchResult.add(flight2);
                            Itinerary itinerary = new Itinerary(departureCity, destinationCity, flightSearchResult);
                        }
                    }
                }
            }

        }

        return itinerarySearchResult;
    }
}
