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

    //getter and setter methods
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

    public flight(int flightNumber, int capacity, String airline, int seatsBooked, int journeyTime, String departure, String destination) {
        //flight constructor
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.airline = airline;
        this.seatsBooked = seatsBooked;
        this.journeyTime = journeyTime;
        this.departure = departure;
        this.destination = destination;
    }
}
