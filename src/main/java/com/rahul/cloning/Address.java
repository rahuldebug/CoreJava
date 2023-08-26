package com.rahul.cloning;

public class Address {
    String Location;

    @Override
    public String toString() {
        return "Address{" +
                "Location='" + Location + '\'' +
                '}';
    }

    public Address(String location) {
        Location = location;
    }
}
