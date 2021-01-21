package com.togethair.service;

import com.togethair.model.Airline;
import org.springframework.stereotype.Service;

@Service
public interface AirlineService {
    Iterable<Airline> getAllAirlines();
    Airline save (Airline airline);
}
