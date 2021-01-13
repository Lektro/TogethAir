package com.togethair.restcontroller;

import com.sun.istack.NotNull;
import com.togethair.model.Flight;
import com.togethair.service.FlightService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class FlightRestController {

    private FlightService flightService;

    public FlightRestController(FlightService flightService ) {
        this.flightService = flightService;
    }

    @GetMapping(value = {"/flights"})
    public @NotNull
    Iterable<Flight> getFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping(value = {"/addFlights"})
    public Flight createFlight(@RequestBody Flight flight) { return flightService.save(flight);
    }
}
