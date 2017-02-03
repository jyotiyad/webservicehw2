package com.jyoti.bookingservice;

import java.util.Scanner;
import java.util.Set;

import com.jyoti.bookingservice.auth.AuthenticationService;
import com.jyoti.bookingservice.flight.FlightService;
import com.jyoti.bookingservice.flight.Itinerary;

public class Client {
    private static String username = null;
    private static String password = null;
    private static String dCity = null;
    private static String aCity = null;

    public static void main(String[] args){

        System.out.println("username:");
        Scanner input = new Scanner(System.in);
        username = input.next();
        System.out.println("password:");
        password  = input.next();

        AuthenticationService login  = new AuthenticationService();
        if(login.authenticateUser(username, password)){
            System.out.println("Login success!");
        }
        else {
            System.out.println("invalid username or password\nExiting.");
        }
        System.out.println("Enter Departure City:");
        dCity = input.next();
        System.out.println(dCity + "->");
        System.out.println("Enter Arrival City:");
        aCity = input.next();
        System.out.println(dCity + "->" + aCity + "\n\n\n");

        System.out.println("Available Flights:");
        FlightService fs = new FlightService();
        Set<Itinerary> flights = fs.searchFlights(dCity, aCity);


    }


}