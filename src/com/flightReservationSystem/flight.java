package com.flightReservationSystem;

//flight class for creating flight object.
public class flight {
    //attributes
    private int flightNumber;
    private int capacity;
    private String airline;
    private int seatsBooked;
    private int journeyTime;
    private String departure;
    private String destination;
    private String arrivalDate;
    private String arrivalTime;
    private String departureDate;
    private String departureTime;

    //getter and setter methods
    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAirline() {
        return airline;
    }

    public int getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(int journeyTime) {
        this.journeyTime = journeyTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public flight(int flightNumber, int capacity, String airline, int seatsBooked, int journeyTime, String departure, String destination, String arrivalDate, String arrivalTime, String departureDate, String departureTime) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.airline = airline;
        this.seatsBooked = seatsBooked;
        this.journeyTime = journeyTime;
        this.departure = departure;
        this.destination = destination;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
    }
}
