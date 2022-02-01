package com.flightReservationSystem;

class contact {
    private double phone;
    private String email;
    private address address;

    public contact(double phone, String email, com.flightReservationSystem.address address) {
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public com.flightReservationSystem.address getAddress() {
        return address;
    }

    public void setAddress(com.flightReservationSystem.address address) {
        this.address = address;
    }
}
