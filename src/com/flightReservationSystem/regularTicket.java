package com.flightReservationSystem;

public class regularTicket extends ticket{
    //child class of ticket
    //attributes
    private boolean food;
    private boolean water;
    private boolean snacks;

    public regularTicket(boolean ticketType, flight flightObj, passenger passengerObj, int price, boolean food, boolean water, boolean snacks) {
        //regularTicket constructor
        //super is a reference variable which is used to refer immediate parent class object
        super(ticketType, flightObj, passengerObj, price);
        this.food = food;
        this.water = water;
        this.snacks = snacks;
    }

    //getter and setter methods
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

