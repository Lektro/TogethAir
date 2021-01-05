package com.togethair.service;

import com.togethair.model.Airline;
import com.togethair.repository.AirlineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AirlineServiceImpl implements AirlineService {

    private final AirlineRepository airlineRepository;

    public AirlineServiceImpl(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public Iterable<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    @Override
    public Iterable<Airline> createAirLine() {
        return null;
    }

    @Override
    public Airline save(Airline airline) {
        return airline;
    }
}
