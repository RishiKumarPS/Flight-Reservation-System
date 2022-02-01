package com.flightReservationSystem;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Flight Reservation System");
        System.out.println("------------------------------------");
        System.out.println("");
        createFlights(2100, 50, "UpGrad Airlines", 0);
        createFlights(2150, 50, "UpGrad Airlines", 0);
        createFlights(2200, 50, "Kingfisher Airlines", 0);

    }

    public static void createFlights(int flightNumber, int capacity, String airline, int seatsBooked) {
        com.flightReservationSystem.flight f1 = new flight(flightNumber, capacity, airline, seatsBooked);

    }
}

