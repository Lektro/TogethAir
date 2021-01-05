package com.togethair.service;

import com.togethair.model.Airline;
import org.springframework.stereotype.Service;

@Service
public interface AirlineService {
    Iterable<Airline> getAllAirlines();

    // these functions are probably not needed in final design because the data comes from the external companies, used for mocks and tests
    Iterable<Airline> createAirLine();
    Airline save (Airline airline);
}
