package com.wanderlusttravels;

public class TravelBookingSystem {
    public static void main(String[] args) {
        String destination = "Hawaii";
        String checkIn = "2024-10-01";
        String checkOut = "2024-10-10";

        /**
        // Manually interacting with each subsystem - Without Facade
        HotelBooking hotelBooking = new HotelBooking();
        FlightBooking flightBooking = new FlightBooking();
        CarRental carRental = new CarRental();
        PaymentService paymentService = new PaymentService();

        hotelBooking.bookHotel(destination, checkIn, checkOut);
        flightBooking.bookFlight(destination, checkIn, checkOut);
        carRental.rentCar(destination, checkIn, checkOut);
        paymentService.processPayment();
        */

        // Using Facade to interact with all subsystems
        TravelBookingFacade bookingFacade = new TravelBookingFacade();
        bookingFacade.bookCompleteTrip(destination, checkIn, checkOut);
    }
}