package com.flightReservationSystem;
import java.util.*;


public class main {
    public static void main(String[] args) {
        //main method is the entry point of any java program
        System.out.println();
        System.out.println("                                   Welcome to Flight Reservation System");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Please wait... Auto Booking a few test cases!!");
        System.out.println();

        //creating users or passenger objects
        passenger p1 = createPassenger("Rishi", 12345679, "rishi@upgrad.com", "Downtown", "Bengaluru", "Karnataka");
        passenger p2 = createPassenger("Rahul", 987654321, "rahul@upgrad.com", "Raisina Hills", "New Delhi", "Delhi");

        //create flight objects
        flight f1 = createFlights(2100, 50, "UpGrad Airlines", 0, 3, "Bengaluru", "Delhi", "15/03/2022", "1500 hrs", "15/03/2022", "1200 hrs");
        flight f2 = createFlights(2150, 50, "UpGrad Airlines", 0, 3, "Delhi", "Bengaluru", "18/03/2022", "1600 hrs", "18/03/2022", "1300 hrs");

        //book tickets
        regularTicket t1 = createTicket1(false, p1,f1, 5000, true, true, true, 15);
        String[] locations = {"Nandi Hills", "Vidhana Soudha", "UB City", "Commercial Street", "Pyramid Valley"};
        touristTicket t2 = createTicket2(true, p2,f2, 6500, "Vivanta by Taj, Yeswanthpur, Bengaluru", locations, 30);

        System.out.println("Test Inputs Submitted... Your tickets are being generated...(100%)");
        System.out.println("Thanks for waiting, here are the booking information for your tickets:");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();

        //print ticket
        System.out.println("Passenger Details: ");
        System.out.println("Passenger ID: "+p1.getPassengerId());
        System.out.println("Name: "+p1.getName());
        System.out.println("Contact Details: Phone: "+p1.getPhone()+" Email: "+p1.getEmail());
        System.out.println("Address: "+p1.getStreet()+", "+p1.getCity()+", "+p1.getState());
        System.out.println("Flight Details:");
        System.out.println("Airline: "+f1.getAirline()+" | Flight Number: "+f1.getFlightNumber()+" | Seating Capacity: "+f1.getCapacity());
        System.out.println("Departure: "+f1.getDeparture()+" | Destination: "+f1.getDestination()+" | Travel Time: "+f1.getJourneyTime());
        System.out.println("Departure Date & Time: "+f1.getDepartureDate()+" "+f1.getDepartureTime()+" | Arrival Date & Time: "+f1.getArrivalDate()+" "+f1.getArrivalTime());
        printTicketDetails(t1);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Passenger Details: ");
        System.out.println("Passenger ID: "+p2.getPassengerId());
        System.out.println("Name: "+p2.getName());
        System.out.println("Contact Details: Phone: "+p2.getPhone()+" Email: "+p2.getEmail());
        System.out.println("Address: "+p2.getStreet()+", "+p2.getCity()+", "+p2.getState());
        System.out.println("Flight Details:");
        System.out.println("Airline: "+f2.getAirline()+" | Flight Number: "+f2.getFlightNumber()+" | Seating Capacity: "+f2.getCapacity());
        System.out.println("Departure: "+f2.getDeparture()+" | Destination: "+f2.getDestination()+" | Travel Time: "+f2.getJourneyTime());
        System.out.println("Departure Date & Time: "+f2.getDepartureDate()+" "+f2.getDepartureTime()+" | Arrival Date & Time: "+f2.getArrivalDate()+" "+f1.getArrivalTime());
        printTicketDetails(t2);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Thank-you for using our service, hoping to serve you again!");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
    }

    public static passenger createPassenger(String name, long phone, String email, String street, String city, String state){
        //creates and returns a passenger object
        return new passenger(name, phone, email, street, city, state);
    }

    public static flight createFlights(int flightNumber, int capacity, String airline, int seatsBooked, int time, String departure, String destination, String arrivalDate, String arrivalTime, String departureDate, String departureTime) {
        //creates and returns a flight object
        return new flight(flightNumber, capacity, airline, seatsBooked, time, departure, destination, arrivalDate, arrivalTime, departureDate, departureTime);
    }

    public static regularTicket createTicket1(boolean ticketType, passenger passenger, flight flight, int price, boolean food, boolean water, boolean snacks, int seatNo){
        //creates and returns a regularTicket object
        return new regularTicket(ticketType, flight, passenger, price, food, water, snacks, seatNo);
    }

    public static touristTicket createTicket2(boolean ticketType, passenger passenger, flight flight, int price, String hotelAddress, String[] touristLocations, int seatNo){
        //creates and returns a touristTicket object
        return new touristTicket(ticketType, flight, passenger, price, hotelAddress, touristLocations, seatNo);
    }

    //overloading printTicketDetails method to print ticket PNR based on ticket type
    public static void printTicketDetails(regularTicket t1){
        //prints regular ticket PNR
        int pnr = t1.getPnr();
        System.out.println("Your Regular Ticket PNR: "+pnr+" | Seat No: "+t1.getSeatNo());
        System.out.println("Value Added Services: Food: "+t1.isFood()+" Water: "+t1.isWater()+" Snacks: "+t1.isSnacks());
    }

    public static void printTicketDetails(touristTicket t2){
        //prints tourist ticket PNR
        int pnr = t2.getPnr();
        System.out.println("Your Tourist Ticket PNR: "+pnr+" | Seat No: "+t2.getSeatNo());
        System.out.println("Hotel: "+t2.getHotelAddress());
        System.out.println("Places to visit: ");
        String[] locations = t2.getTouristLocations();
        System.out.print(locations[0]+", "+locations[1]+", "+locations[2]+", "+locations[3]+", "+locations[4]);
    }
}

