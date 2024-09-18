package com.wanderlusttravels;

public class TravelBookingFacade {
    private HotelBooking hotelBooking;
    private FlightBooking flightBooking;
    private CarRental carRental;
    private PaymentService paymentService;

    public TravelBookingFacade() {
        hotelBooking = new HotelBooking();
        flightBooking = new FlightBooking();
        carRental = new CarRental();
        paymentService = new PaymentService();
    }

    public void bookCompleteTrip(String destination, String checkIn, String checkOut) {
        hotelBooking.bookHotel(destination, checkIn, checkOut);
        flightBooking.bookFlight(destination, checkIn, checkOut);
        carRental.rentCar(destination, checkIn, checkOut);
        paymentService.processPayment();
        System.out.println("Trip to " + destination + " from " + checkIn + " to " + checkOut + " booked successfully!");
    }
}
