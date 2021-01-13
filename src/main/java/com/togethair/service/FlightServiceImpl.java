package com.togethair.service;

import com.togethair.model.Flight;
import com.togethair.repository.FlightRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {
    private final FlightRepository flightRepository;


    public FlightServiceImpl(FlightRepository flightRepository) { this.flightRepository = flightRepository ;}

    @Override
    public Iterable<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }
}
