package com.togethair.service;

import com.togethair.model.Airline;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AirlineService {
    Iterable<Airline> getAllAirlines();
    Airline save (Airline airline);
}
