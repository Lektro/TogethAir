package com.togethair.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "flight", schema = "togethair")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long basePrice;

    @OneToOne
    @JoinColumn(name="fk_departure_airport_id")
    // Naamgeving moet hetzelfde zijn in je Angular Model
    private Airport departureAirport;

    @OneToOne
    @JoinColumn(name="fk_arrival_airport_id")
    private Airport arrivalAirport;

    @Column()
    private Long flightDuration;

    @ManyToOne
    @JoinColumn(name="fk_airline_id")
    private Airline airline;

    // vital for prototype
    @Column
    private int totalSeats;

    @Column()
    private String flightNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Long basePrice) {
        this.basePrice = basePrice;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Long getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Long flightDuration) {
        this.flightDuration = flightDuration;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
