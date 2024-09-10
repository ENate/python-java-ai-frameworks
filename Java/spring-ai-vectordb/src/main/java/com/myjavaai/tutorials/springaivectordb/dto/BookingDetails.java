package com.myjavaai.tutorials.springaivectordb.dto;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.myjavaai.tutorials.springaivectordb.entity.BookingStatus;

@JsonInclude(Include.NON_NULL)
public record BookingDetails(String bookingNumber,
            String firstName,
            String lastName,
            LocalDate date,
            BookingStatus bookingStatus,
            String from,
            String to,
            String bookingClass) {

}
