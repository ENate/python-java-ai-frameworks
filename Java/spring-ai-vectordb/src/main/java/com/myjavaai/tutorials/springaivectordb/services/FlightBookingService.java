package com.myjavaai.tutorials.springaivectordb.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.myjavaai.tutorials.springaivectordb.dto.BookingDetails;
import com.myjavaai.tutorials.springaivectordb.entity.Booking;
import com.myjavaai.tutorials.springaivectordb.entity.BookingClass;
import com.myjavaai.tutorials.springaivectordb.entity.BookingData;
import com.myjavaai.tutorials.springaivectordb.entity.BookingStatus;
import com.myjavaai.tutorials.springaivectordb.entity.Customer;

@Service
public class FlightBookingService {

    private final BookingData db;

    public FlightBookingService() {
        db = new BookingData();
        initDemoData();
    }

    private void initDemoData() {
        // Define some data
        List<String> firstNames = List.of("John", "Jane", "Michael", "Sarah", "Robert");
        List<String> lastNames = List.of("Doe", "Smith", "Johnson", "Williams", "Taylor");
        List<String> airportCodes = List.of("LAX", "SFO", "JFK", "LHR", "CDG", "ARN", "HEL", "TXL", "MUC", "FRA", "MAD",
                "FUN", "SJC");
        Random random = new Random();

        // Empty arraylist of customers, and bookings
        var customers = new ArrayList<Customer>();
        var bookings = new ArrayList<Booking>();

        // Assign names and booking info to Custome and Booking Arraylist

        for (int i = 0; i < 5; i++) {
            String firstName = firstNames.get(i);
            String lastName = lastNames.get(i);
            String from = airportCodes.get(random.nextInt(airportCodes.size()));
            String to = airportCodes.get(random.nextInt(airportCodes.size()));
            BookingClass bookingClass = BookingClass.values()[random.nextInt(BookingClass.values().length)];
            Customer customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);

            LocalDate date = LocalDate.now().plusDays(2 * i);

            Booking booking = new Booking("10" + (i + 1), date, customer, BookingStatus.CONFIRMED, from, to,
                    bookingClass);
            customer.getBookings().add(booking);

            customers.add(customer);
            bookings.add(booking);
        }
        // Set booking data
        db.setCustomers(customers);
        db.setBookings(bookings);
    }

    // Create bookings from list of Bookings class
    public List<BookingDetails> getBookings() {
        return db.getBookings().stream().map(this::toBookingDetails).toList();
    }

    // Find booking
    private Booking findBooking(String bookingNumber, String firstName, String lastName) {
        return db.getBookings().stream()
                .filter(b -> b.getBookingNumber().equalsIgnoreCase(bookingNumber))
                .filter(b -> b.getCustomer().getFirstName().equalsIgnoreCase(firstName))
                .filter(b -> b.getCustomer().getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Booking Not found"));
    }

    public BookingDetails getBookingDetails(String bookingNumber, String firstName, String lastName) {
        var booking = findBooking(bookingNumber, firstName, lastName);
        return toBookingDetails(booking);
    }

    // Change booking
    public void changeBooking(String bookingNumber, String firstName, String lastName, String newDate, String from, String to) {
        var booking = findBooking(bookingNumber, firstName, lastName);
        if (booking.getDate().isBefore(LocalDate.now().plusDays(1))) {
            throw new IllegalArgumentException("Booking Cannot be changed within 25 hours of start date.");
        }
        booking.setDate(LocalDate.parse(newDate));
        booking.setFrom(from);
        booking.setTo(to);
    }

    public void cancelBooking(String bookingNumber, String firstName, String lastName) {
        // Find booking
        var booking = findBooking(bookingNumber, firstName, lastName);
        // Check if booking is before 48 hours
        if (booking.getDate().isBefore(LocalDate.now().plusDays(2))) {
            throw new IllegalArgumentException("Booking data cannot be canceled within 48 hours of start date!");
        }
        booking.setBookingStatus(BookingStatus.CANCELLED);
    }

    // Used to create funtion reference for BookingDetails
    private BookingDetails  toBookingDetails(Booking booking) {
        return new BookingDetails(
            booking.getBookingNumber(),
            booking.getCustomer().getFirstName(),
            booking.getCustomer().getLastName(),
            booking.getDate(),
            booking.getBookingStatus(),
            booking.getFrom(),
            booking.getTo(),
            booking.getBookingClass().toString()
        );
    }
}