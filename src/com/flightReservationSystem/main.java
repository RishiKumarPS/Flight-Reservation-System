package com.flightReservationSystem;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Flight Reservation System");
        System.out.println("------------------------------------");
        System.out.println("");
        createFlights(2100, 50, "UpGrad Airlines", 0);
        createFlights(2150, 50, "UpGrad Airlines", 0);
        createFlights(2200, 50, "Kingfisher Airlines", 0);
        login();

    }

    public static void createFlights(int flightNumber, int capacity, String airline, int seatsBooked){
        com.flightReservationSystem.flight f1 = new flight(flightNumber, capacity, airline, seatsBooked);

    }

    public static void login() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.println("1) Passenger");
        System.out.println("2) System Admin");
        System.out.println("3) Exit");
        choice = sc.nextInt();
        switch (choice) {
            case 1: {
                passengerLogin();
                break;
            }
            case 2: {
                adminLogin();
                break;
            }
            case 3: {
                System.exit(0);
            }
            default: {
                System.out.println("Incorrect input, lets try that again.");
                login();
                break;
            }
        }
    }

    public static void passengerLogin(){

    }

    public static void adminLogin(){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1) Manage Flights");
        choice = sc.nextInt();
        switch (choice){
            case 1: {
                manageFlights();
                break;
            }
            default: {
                System.out.println("Incorrect input, lets try that again.");
                adminLogin();
                break;
            }
        }
    }

    public static void manageFlights(){

    }
}
