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

    @Override
    public Iterable<Airline> getAllAirlines() { return airlineRepository.findAll(); }

    @Override
    public Airline save(Airline airline) {
        return airlineRepository.save(airline);
    }
}
