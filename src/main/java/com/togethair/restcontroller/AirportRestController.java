package com.togethair.restcontroller;

import com.sun.istack.NotNull;
import com.togethair.model.Airport;
import com.togethair.model.Ticket;
import com.togethair.service.AirportService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AirportRestController {

    private final AirportService airportService;

    public  AirportRestController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping(value = {"/airports"})
    public @NotNull
    Iterable<Airport> getAirports() {
        return airportService.getAllAirports();
    }

    @PostMapping("/createAirports")
    public Airport createAirport(@RequestBody Airport airport) {return airportService.save(airport); }


}
