package com.togethair.service;

import com.togethair.model.Ticket;
import com.togethair.repository.TicketRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Iterable<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket save(Ticket ticket) {
        return ticket;
    }
}
