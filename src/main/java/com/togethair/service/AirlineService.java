package com.togethair.service;

import com.togethair.model.Airline;
import com.togethair.model.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface AirlineService {
    Iterable<Airline> getAllAirlines();

    // these functions are probably not needed in final design because the data comes from the external companies, used for mocks and tests
    Iterable<Ticket> createAirLine();
    Ticket save (Ticket ticket);
}
