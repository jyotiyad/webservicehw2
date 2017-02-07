package com.jyoti.ws.clientTopDown;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lpoon2 on 2/7/2017.
 */
public class client {


    private static String username = null;
    private static String password = null;
    private static String dCity = null;
    private static String aCity = null;
    private static String token = null;
    private static String name = null;
    private static String card = null;
    private static String date = null;
    private static URL url = getWSDLURL("http://localhost:8000/?wsdl");
    private static List<Flight> flights ;
    public static void main(String[] args) throws com.jyoti.ws.client.AuthenticationException_Exception {
        // Test

        Flight f = new Flight();
        f.setDestinationCity("paris");
        f.setDepartureCity("stockholm");
        f.setFlightId(0);
        f.setPrice(1111.0);
        flights = Arrays.asList(f);

        Itinerary it = new Itinerary();
        it.setDepartureCity("stockholm");
        it.setDestinationCity("paris");
        it.setTotalPrice(1111.0);
        it.setFlight(flights);

        FlightBookingServiceTopDownService service = new FlightBookingServiceTopDownService(url);
        com.jyoti.ws.clientTopDown.FlightBookingServiceTopDown flightBookingService = service.getFlightBookingServiceTopDownPort();


        System.out.println(flightBookingService.checkAvailable(it));
        System.out.println(flightBookingService.getPrice(it));

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