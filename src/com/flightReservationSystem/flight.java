package com.flightReservationSystem;

public class flight {
    private int flightNumber;
    private int capacity;
    private String airline;
    private int seatsBooked;

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

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public flight(int flightNumber, int capacity, String airline, int seatsBooked) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.airline = airline;
        this.seatsBooked = seatsBooked;
    }
}
