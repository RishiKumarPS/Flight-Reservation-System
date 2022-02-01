package com.flightReservationSystem;
import java.util.*;

public abstract class ticket {
    private int pnrCounter = 1000;
    private int pnr;
    private flight flight;
    private passenger passenger;
    private int seatNo;
    private boolean ticketType;
    //need to think of some way to include date and time
    private int price;

    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isTicketType() {
        return ticketType;
    }

    public void setTicketType(boolean ticketType) {
        this.ticketType = ticketType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public com.flightReservationSystem.flight getFlight() {
        return flight;
    }

    public void setFlight(com.flightReservationSystem.flight flight) {
        this.flight = flight;
    }

    public ticket(int seatNo, boolean ticketType, flight flight, passenger passenger, int price) {
        this.pnr = pnrCounter++;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.ticketType = ticketType;
        this.price = price;
    }
}
