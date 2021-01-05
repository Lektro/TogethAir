package com.togethair.service;

import com.togethair.model.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {
    Iterable<Ticket> getAllTickets();
    Iterable<Ticket> createTicket();
    Ticket save (Ticket ticket);

}
