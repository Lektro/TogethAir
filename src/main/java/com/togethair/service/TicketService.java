package com.togethair.service;

import com.togethair.model.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {
    Iterable<Ticket> getAllTickets();
    Ticket save (Ticket ticket);

}
