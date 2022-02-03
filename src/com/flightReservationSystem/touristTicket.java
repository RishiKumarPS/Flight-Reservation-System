package com.flightReservationSystem;

public class touristTicket extends ticket {
    //child class of ticket
    //attributes
    private String hotelAddress;
    private String[] touristLocations = new String[5];

    public touristTicket(boolean ticketType, flight flightObj, passenger passengerObj, int price, String hotelAddress, String[] touristLocations, int seatNo) {
        //touristTicket constructor
        //super is a reference variable which is used to refer immediate parent class object
        super(ticketType, flightObj, passengerObj, price, seatNo);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    //getter and setter methods
    @Override
    public int getPnr() {
        return super.getPnr();
    }

    public int getSeatNo() { return super.getSeatNo(); }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocations() {
        return touristLocations;
    }

    public void setTouristLocations(String[] touristLocations) {
        this.touristLocations = touristLocations;
    }
}

