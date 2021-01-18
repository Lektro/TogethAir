package com.togethair.model;

import javax.persistence.*;

@Entity
@Table(name = "airport", schema = "togethair")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String airportCode;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    // make an Enum based on Regions?
    @Column(nullable = false)
    private String region;

    // may be a bit too much
/*
    @OneToMany
    private List<Flight> listFlights = new ArrayList<>();
*/

    public Airport() {
    }

    public Airport(Long id, String airportCode, String name, String country, String region) {
        this.id = id;
        this.airportCode = airportCode;
        this.name = name;
        this.country = country;
        this.region = region;
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
