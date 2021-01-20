package com.togethair.restcontroller;

import com.sun.istack.NotNull;
import com.togethair.model.Ticket;
import com.togethair.model.User;
import com.togethair.service.TicketService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketRestController {

    private TicketService ticketService;

    public TicketRestController (TicketService ticketService){ this.ticketService = ticketService; }

    @GetMapping(value = {"/tickets"})
    public @NotNull Iterable<Ticket> getTickets() {
       return ticketService.getAllTickets();
    }

    /// ticket needs a user ID aswell oops not sure how to inject
    @PostMapping(value = {"/createTicket"})
    public Ticket createTicket(@RequestBody Ticket ticket) { return ticketService.save(ticket); }
}
