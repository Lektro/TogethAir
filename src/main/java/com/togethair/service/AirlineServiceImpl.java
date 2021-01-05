package com.togethair.service;

import com.togethair.model.Airline;
import com.togethair.model.Ticket;
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
    public Iterable<Ticket> createAirLine() {
        return null;
    }

    @Override
    public Ticket save(Ticket ticket) {
        return null;
    }
}
