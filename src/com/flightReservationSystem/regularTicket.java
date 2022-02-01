package com.flightReservationSystem;

public class regularTicket extends ticket{

    private boolean food;
    private boolean water;
    private boolean snacks;
    private ticket ticket;

    public regularTicket(int pnr, int seatNo, boolean ticketType, String departure, String destination, int price, boolean food, boolean water, boolean snacks, com.flightReservationSystem.ticket ticket) {
        super(pnr, seatNo, ticketType, departure, destination, price);
        this.food = food;
        this.water = water;
        this.snacks = snacks;
        this.ticket = ticket;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isSnacks() {
        return snacks;
    }

    public void setSnacks(boolean snacks) {
        this.snacks = snacks;
    }

    public com.flightReservationSystem.ticket getTicket() {
        return ticket;
    }

    public void setTicket(com.flightReservationSystem.ticket ticket) {
        this.ticket = ticket;
    }
}

