package com.myjavaai.tutorials.springaivectordb.entity;

import java.time.LocalDate;

public class Booking {
    // Define columns
    private String bookingNumber;
    private LocalDate date;
    private Customer customer;
    private LocalDate bookingTo;
    private String from;
    private String to;
    private BookingClass bookingClass;
    private BookingStatus BookingStatus;

    public Booking(String bookingNumber, LocalDate date, Customer customer, BookingStatus bookingStatus, String from, String to, BookingClass bookingClass) {
        this.bookingNumber = bookingNumber;
        this.date = date;
        this.customer = customer;
        this.from = from;
        this.to = to;
        this.bookingClass = bookingClass;
        this.BookingStatus = bookingStatus;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public LocalDate getBookingTo() {
        return bookingTo;
    }

    public void setBookingTo(LocalDate bookingTo) {
        this.bookingTo = bookingTo;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(BookingClass bookingClass) {
        this.bookingClass = bookingClass;
    }

    public BookingStatus getBookingStatus() {
        return BookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        BookingStatus = bookingStatus;
    }

    

    

}
