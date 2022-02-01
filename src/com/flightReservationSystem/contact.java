package com.flightReservationSystem;

class contact {
    private double phone;
    private String email;

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

    public contact(double phone, String email) {
        this.phone = phone;
        this.email = email;
    }
}
