package com.myjavaai.tutorials.springaivectordb.client;

import java.util.List;

import com.myjavaai.tutorials.springaivectordb.dto.BookingDetails;
import com.myjavaai.tutorials.springaivectordb.services.FlightBookingService;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

@BrowserCallable
@AnonymousAllowed
public class BookingService {

    private final FlightBookingService flightBookingService;

    public BookingService(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    public List<BookingDetails> getBookings() {
        return flightBookingService.getBookings();
    }

}
