package com.flightReservationSystem;

public class regularTicket extends ticket{

    private boolean food;
    private boolean water;
    private boolean snacks;

    public regularTicket(boolean ticketType, flight flightObj, passenger passengerObj, int price, boolean food, boolean water, boolean snacks) {
        super(ticketType, flightObj, passengerObj, price);
        this.food = food;
        this.water = water;
        this.snacks = snacks;
    }

    @Override
    public int getPnr() {
        return super.getPnr();
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

}

