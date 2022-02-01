package com.flightReservationSystem;
import java.util.*;

public class ticket {
    private int pnr;
    private int seatNo;
    private boolean ticketType;
    private String departure;
    private String destination;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ticket(int pnr, int seatNo, boolean ticketType, String departure, String destination, int price) {
        this.pnr = pnr;
        this.seatNo = seatNo;
        this.ticketType = ticketType;
        this.departure = departure;
        this.destination = destination;
        this.price = price;
    }
}
