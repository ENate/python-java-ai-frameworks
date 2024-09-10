package com.myjavaai.tutorials.springaivectordb.entity;

import java.util.ArrayList;
import java.util.List;

public class BookingData {

    // Define list of Customers and Booking
    private List<Customer> customers = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();


    // Getters and Setters
    public List<Customer> getCustomers() {
        return customers;
    }
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public List<Booking> getBookings() {
        return bookings;
    }
    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

}
