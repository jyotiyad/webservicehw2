package com.jyoti.bookingservice.flight;

public class FlightInventory {
    private int flightId;
    private int totalSeats;
    private int availableSeats;

    public FlightInventory(int flightId, int totalSeats) {
        this.flightId = flightId;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }
}
