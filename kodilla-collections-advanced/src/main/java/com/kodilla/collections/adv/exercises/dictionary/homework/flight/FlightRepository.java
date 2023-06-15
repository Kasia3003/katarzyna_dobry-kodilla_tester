package com.kodilla.collections.adv.exercises.dictionary.homework.flight;

public class FlightRepository {
    private Flight flight;
    private String departure;
    private String arrival;

    public FlightRepository(Flight flight, String departure, String arrival) {
        this.flight = flight;
        this.departure = departure;
        this.arrival = arrival;
    }

    public FlightRepository(Flight flight, String wylot) {
    }

    public Flight getFlight() {
        return flight;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int size() {
        return 0;
    }

    public void addFlight(String departure, FlightRepository flightRepository) {
    }
}
