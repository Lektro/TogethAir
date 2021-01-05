package com.togethair.service;

import com.togethair.model.Flight;
import org.springframework.stereotype.Service;

@Service
public interface FlightService {
    Iterable<Flight> getAllFlights();
    Flight save(Flight flight);
}
