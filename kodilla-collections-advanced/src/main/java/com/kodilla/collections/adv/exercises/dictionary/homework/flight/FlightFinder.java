package com.kodilla.collections.adv.exercises.dictionary.homework.flight;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {

    private FlightFinder flightFinder;

    Map<String, List<FlightRepository>> findFlightsFrom = new HashMap<>();
    public void addFlight(String departure, FlightRepository flightRepository) {

    }
    public List<FlightRepository> findFlightRepository(String departure) {
        return flightFinder.getOrDefault(departure, Collections.emptyList());
    }

    private List<FlightRepository> getOrDefault(String departure, List<Object> objects) {
    return null;
    }

    public List<FlightRepository> findFlightRepository(String departure, Flight flight) {
        return Collections.emptyList();
    }
    public int size() {
        return flightFinder.size();
    }

}
