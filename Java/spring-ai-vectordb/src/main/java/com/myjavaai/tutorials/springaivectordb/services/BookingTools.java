package com.myjavaai.tutorials.springaivectordb.services;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.core.NestedExceptionUtils;

import com.myjavaai.tutorials.springaivectordb.dto.BookingDetails;
import com.myjavaai.tutorials.springaivectordb.dto.BookingDetailsRequest;
import com.myjavaai.tutorials.springaivectordb.dto.CancelBookingRequest;
import com.myjavaai.tutorials.springaivectordb.dto.ChangeBookingDatesRequest;

@Configuration
public class BookingTools {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(BookingTools.class);

    // Consider change
    private FlightBookingService flightBookingService;

    public BookingTools(FlightBookingService flightBookingService) {
        this.flightBookingService = flightBookingService;
    }

    @Bean
    @Description("Get booking details")
    public Function<BookingDetailsRequest, BookingDetails> getBookingDetails() {
        return request -> {
            try {
                return flightBookingService.getBookingDetails(request.bookingNumber(), request.firstName(),
                        request.lastName());
            }
            catch (Exception e) {
                logger.warn("Booking details: {}", NestedExceptionUtils.getMostSpecificCause(e).getMessage());
                return new BookingDetails(request.bookingNumber(), request.firstName(), request.lastName(),
                        null, null, null, null, null);
            }
        };
    }

    @Bean
    @Description("Change booking dates")
    public Function<ChangeBookingDatesRequest, String> changeBooking() {
        return request -> {
            flightBookingService.changeBooking(request.bookingNumber(), request.firstName(), request.lastName(),
                    request.date(), request.from(), request.to());
            return "";
        };
    }

    @Bean
    @Description("Cancel booking")
    public Function<CancelBookingRequest, String> cancelBooking() {
        return request -> {
            flightBookingService.cancelBooking(request.bookingNumber(), request.firstName(), request.lastName());
            return "";
        };
    }


}
