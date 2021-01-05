package com.togethair.restcontroller;

import com.sun.istack.NotNull;
import com.togethair.model.Ticket;
import com.togethair.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketRestController {

    private final TicketService ticketService;

    public TicketRestController (TicketService ticketService){ this.ticketService = ticketService; }

    @GetMapping(value = {"/tickets"})
    public @NotNull Iterable<Ticket> getTickets() {
       return ticketService.getAllTickets();
    }

    @PostMapping("/createTickets")
    public Ticket createTicket(@RequestBody Ticket ticket) {return ticketService.save(ticket); }
}
