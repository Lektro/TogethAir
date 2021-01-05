package com.togethair.service;

import com.togethair.model.Airport;
import com.togethair.repository.AirportRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    public AirportServiceImpl (AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public Iterable<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Airport save(Airport airport) {
        return airport;
    }
}
