package com.jyoti.bookingservice.flight;

public class Flight {
    private int flightId;
    private String departureCity;
    private String destinationCity;
    private String day;
    private String month;
    private String year;
    private Double price;

    public Flight(int flightId, String departureCity, String destinationCity, String day, String month, String year, Double price) {
        this.flightId = flightId;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.day = day;
        this.month = month;
        this.year = year;
        this.price = price;
    }


    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
