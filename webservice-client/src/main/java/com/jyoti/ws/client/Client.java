package com.jyoti.ws.client;

//import com.jyoti.bookingservice.auth.AuthenticationException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static String username = null;
    private static String password = null;
    private static String dCity = null;
    private static String aCity = null;
    private static String token = null;
    private static String name = null;
    private static String card = null;
    private static String date = null;
    private static URL url = getWSDLURL("http://localhost:8080/webservice-hw2/FlightBookingService?wsdl");

    public static void main(String[] args) throws AuthenticationException_Exception {

        FlightBookingServiceService service = new FlightBookingServiceService(url);
        com.jyoti.ws.client.FlightBookingService flightBookingService = service.getFlightBookingServicePort();
        System.out.println("username:");
        Scanner input = new Scanner(System.in);
        username = input.next();
        System.out.println("password:");
        password  = input.next();
        String login = flightBookingService.login(username, password);
        System.out.println("login response=" + login);
        System.out.println("Enter Departure City:");
        dCity = input.next();
        System.out.println(dCity + "->");
        System.out.println("Enter Arrival City:");
        aCity = input.next();
        System.out.println("Date (yyyy-mm-dd):");
        date = input.next();
        System.out.println(dCity + "->" + aCity + "\n");
        System.out.println("Available Flights:");
        //List<Itinerary> flights = flightBookingService.searchItinerary(login, dCity, aCity);
        List<Itinerary> flights = flightBookingService.searchAvailableItinerary(login, dCity, aCity, date);
        int i = 1;
        for(Itinerary it : flights){
            System.out.println("Choice #" + i );
            List<Flight> temp = it.getFlights();
            String s = "";
            int price = 0 ;
            for(Flight f : temp ){
                s += f.getDepartureCity() + "->" + f.getDestinationCity();
                price += f.getPrice();
            }
            System.out.println(s);
            System.out.println("Price: $" + price);
        }
        System.out.println("Enter your choice number: ");
        int choice = input.nextInt();
        while( choice > flights.size() || choice <= 0 ){
            System.out.println("Invalid entry!");
            System.out.println("Enter your choice number: ");
            choice = input.nextInt();
        }
        Itinerary target = flights.get(choice-1);
        System.out.println("Enter your billing information: \n Name: ");
        name = input.next();
        System.out.println("Credit card #:  ");
        card = input.next();
        try {
            System.out.println(flightBookingService.bookTicket(login, name , card, target));
        } catch (InvalidCardDetailsException_Exception e) {
            e.printStackTrace();
        } catch (SeatNotAvailableException_Exception e) {
            e.printStackTrace();
        } catch (AuthenticationException_Exception e){
            e.printStackTrace();
        }
    }

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

}

