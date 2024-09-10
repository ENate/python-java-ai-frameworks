package com.myjavaai.tutorials.springaivectordb.dto;

public record ChangeBookingDatesRequest(String bookingNumber, String firstName, String lastName, String date,
String from, String to) {

}
