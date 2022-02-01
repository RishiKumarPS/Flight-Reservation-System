package com.flightReservationSystem;

public class touristTicket extends ticket {
    private String hotelAddress;
    private String[] touristLocations = new String[5];

    public touristTicket(boolean ticketType, flight flightObj, passenger passengerObj, int price, String hotelAddress, String[] touristLocations) {
        super(ticketType, flightObj, passengerObj, price);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    @Override
    public int getPnr() {
        return super.getPnr();
    }

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

