package com.jyoti.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    private static URL url = getWSDLURL("http://localhost:8080/webservice-hw2/FlightBookingService?wsdl");

    public static void main(String[] args) throws AuthenticationException_Exception {

        FlightBookingServiceService service = new FlightBookingServiceService(url);
        FlightBookingService flightBookingService = service.getFlightBookingServicePort();
        String login = flightBookingService.login("test", "test");
        System.out.println("login response=" + login);

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

