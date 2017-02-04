package com.jyoti.ws.client;

public class Client {
    private static String username = null;
    private static String password = null;
    private static String dCity = null;
    private static String aCity = null;

    /*public static void main(String[] args){

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
        System.out.println(dCity + "->" + aCity + "\n");

        System.out.println("Available Flights:");
        FlightService fs = new FlightService();
        Set<Itinerary> flights = fs.searchFlights(dCity, aCity);
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

    }*/


}
