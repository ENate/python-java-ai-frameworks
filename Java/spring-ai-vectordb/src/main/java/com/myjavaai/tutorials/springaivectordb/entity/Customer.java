package com.myjavaai.tutorials.springaivectordb.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;

    private List<Booking> bookings = new ArrayList<>();

    public Customer() {}
    

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

}
