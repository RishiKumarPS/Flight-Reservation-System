package com.flightReservationSystem;

public class touristTicket {
    private String hotelAddress;
    private String[] touristLocations = new String[5];

    public touristTicket(String hotelAddress, String[] touristLocations) {
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

