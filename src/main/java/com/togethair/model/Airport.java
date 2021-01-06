package com.togethair.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airport", schema = "togethair")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false,length = 3)
    private String airportCode;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(nullable = false,length = 100)
    private String country;

    @Column(nullable = false,length = 100)
    private String region;

    // may be a bit too much
/*
    @OneToMany
    private List<Flight> listFlights = new ArrayList<>();
*/

    public Airport() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

/*    public List<Flight> getListFlights() {
        return listFlights;
    }

    public void setListFlights(List<Flight> listFlights) {
        this.listFlights = listFlights;
    }*/
}
