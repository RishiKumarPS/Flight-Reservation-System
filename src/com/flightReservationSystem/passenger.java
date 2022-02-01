package com.flightReservationSystem;

public class passenger {
    private int passengerId;
    private String name;
    private contact contact;

    public passenger(int passengerId, String name, com.flightReservationSystem.contact contact) {
        this.passengerId = passengerId;
        this.name = name;
        this.contact = contact;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.flightReservationSystem.contact getContact() {
        return contact;
    }

    public void setContact(com.flightReservationSystem.contact contact) {
        this.contact = contact;
    }
}
