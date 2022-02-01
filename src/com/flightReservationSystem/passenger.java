package com.flightReservationSystem;

public class passenger {
    private static int idCounter = 1;
    private int passengerId;
    private String name;
    private passenger.contact contact;
    private passenger.address address;

    public passenger(String name, long phone, String email, String street, String city, String state) {
        this.passengerId = idCounter++;
        this.name = name;
        this.contact = new passenger.contact(phone, email);
        this.address = new passenger.address(street, city, state);
    }

    public int getPassengerCount(){
        return idCounter;
    }

    public passenger.address getAddress() {
        return address;
    }

    public void setAddress(passenger.address address) {
        this.address = address;
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

    public passenger.contact getContact() {
        return contact;
    }

    public void setContact(passenger.contact contact) {
        this.contact = contact;
    }

    private static class contact {
        private long phone;
        private String email;

        public contact(long phone, String email) {
            this.phone = phone;
            this.email = email;
        }

        public long getPhone() {
            return phone;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }


    private static class address {
        private String street;
        private String city;
        private String state;

        public address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
