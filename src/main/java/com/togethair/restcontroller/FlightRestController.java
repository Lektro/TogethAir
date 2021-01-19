package com.togethair.restcontroller;

import com.sun.istack.NotNull;
import com.togethair.model.Flight;
import com.togethair.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    // je mag geen twee keer dezelfde GetMapping uitvoeren op dezelfde url
    @GetMapping(path = "/getFlightById/{id}")
    public Optional<Flight> getFlightDetails(@PathVariable(value = "id") Long id) {
         Optional<Flight> flightData = flightService.getFlightById(id);
        return flightData;
    }

    @DeleteMapping("/flights/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteById(id);
    }

}
