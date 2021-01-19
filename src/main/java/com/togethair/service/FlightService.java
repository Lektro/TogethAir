package com.togethair.service;

import com.togethair.model.Flight;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FlightService {
    Iterable<Flight> getAllFlights();
    Flight save(Flight flight);
    void deleteById(Long id);
    Optional<Flight> getFlightById(Long flight);
}
