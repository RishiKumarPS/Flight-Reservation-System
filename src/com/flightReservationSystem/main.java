package com.flightReservationSystem;
import java.util.*;


public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to Flight Reservation System");
        System.out.println("------------------------------------");
        System.out.println("");
        passenger p1 = createPassenger("Rishi", 12345679, "rishi@upgrad.com", "Downtown", "Bengaluru", "Karnataka");
        passenger p2 = createPassenger("Rahul", 987654321, "rahul@upgrad.com", "Raisina Hills", "New Delhi", "Delhi");
        flight f1 = createFlights(2100, 50, "UpGrad Airlines", 0, 3, "Bengaluru", "Delhi");
        flight f2 = createFlights(2150, 50, "UpGrad Airlines", 0, 3, "Delhi", "Bengaluru");
        regularTicket t1 = createTicket1(false, p1,f1, 5000, true, true, true);
        String[] locations = {"Nandi Hills", "Vidhana Soudha", "UB City", "Commercial Street", "Pyramid Valley"};
        touristTicket t2 = createTicket2(true, p1,f1, 6500, "Vivata by Taj, Yeswanthpur, Bengaluru", locations);
        printTicketDetails(t1);
        printTicketDetails(t2);
    }

    public static passenger createPassenger(String name, long phone, String email, String street, String city, String state){
        passenger create = new passenger(name, phone, email, street, city, state);
        return create;
    }

    public static flight createFlights(int flightNumber, int capacity, String airline, int seatsBooked, int time, String departure, String destination) {
        flight create = new flight(flightNumber, capacity, airline, seatsBooked, time, departure, destination);
        return create;
    }

    public static regularTicket createTicket1(boolean ticketType, passenger passenger, flight flight, int price, boolean food, boolean water, boolean snacks){
        regularTicket obj = new regularTicket(ticketType, flight, passenger, price, food, water, snacks);
        return obj;
    }

    public static touristTicket createTicket2(boolean ticketType, passenger passenger, flight flight, int price, String hotelAddress, String[] touristLocations){
        touristTicket obj = new touristTicket(ticketType, flight, passenger, price, hotelAddress, touristLocations);
        return obj;
    }

    public static void printTicketDetails(regularTicket regularTicket){
        int pnr = regularTicket.getPnr();
        System.out.println(pnr);
    }

    public static void printTicketDetails(touristTicket touristTicket){
        int pnr = touristTicket.getPnr();
        System.out.println(pnr);
    }
}

