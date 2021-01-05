package com.togethair.restcontroller;

import com.sun.istack.NotNull;
import com.togethair.model.Airline;
import com.togethair.model.Ticket;
import com.togethair.service.AirlineService;
import com.togethair.service.AirlineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AirlineRestController {

    private AirlineService airlineService;

    public AirlineRestController(AirlineService airlineService){
        this.airlineService =  airlineService;
    }

    @GetMapping(value = {"/airlines"})
    public @NotNull Iterable<Airline> getAirlines() {
        return airlineService.getAllAirlines();
    }

    @PostMapping("/createAirlines")
    public Airline createAirline(@RequestBody Airline airline) {return airlineService.save(airline); }


}