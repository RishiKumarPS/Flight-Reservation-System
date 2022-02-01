package com.flightReservationSystem;

public class touristTicket extends ticket {
    private String hotelAddress;
    private String[] touristLocations = new String[5];

    public touristTicket(int seatNo, boolean ticketType, flight flightObj, passenger passengerObj, int price, String hotelAddress, String[] touristLocations) {
        super(seatNo, ticketType, flightObj, passengerObj, price);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
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

