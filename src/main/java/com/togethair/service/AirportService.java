package com.togethair.service;

import com.togethair.model.Airline;
import com.togethair.model.Airport;
import org.springframework.stereotype.Service;

@Service
public interface AirportService {
    Iterable<Airport> getAllAirports();
    Airport save (Airport airport);

}
