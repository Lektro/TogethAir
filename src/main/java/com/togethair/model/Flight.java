package com.togethair.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight", schema = "togethair")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long basePrice;

//    ook hier is de cascadetype.refresh heel belangrijk
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name="fk_departure_airport_id")
    // Naamgeving moet hetzelfde zijn in je Angular Model
    private Airport departureAirport;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name="fk_arrival_airport_id")
    private Airport arrivalAirport;

    // int is probably better here
    @Column(nullable = false)
    private Long flightDuration;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name="fk_airline_id")
    private Airline airline;

    // vital for prototype but needs to be split into seperate travel classes
    @Column(nullable = false)
    private int totalSeats;

    private int availableSeats;

    private int totalEconomyClassSeats;

    private int availableEconomyClassSeats;

    private int availableFirstClassSeats;

    private int totalFirstClassSeats;

    private int availableBusinessClassSeats;

    private int totalBusinessClassSeats;

    @Column(nullable = false)
    private String flightNumber;

//    I could choose to insert string here if the front end gives to much trouble the flight list is out of scope anyway
    @Column(name = "departure_time", columnDefinition = "DATETIME")
    private LocalDateTime departureTime;

    //    I could choose to insert string here if the front end gives to much trouble the flight list is out of scope anyway
    @Column(name = "arrival_time", columnDefinition = "DATETIME")
    private LocalDateTime arrivalTime;

    public Flight () {

    }

    public Flight(Long id, Long basePrice, Airport departureAirport, Airport arrivalAirport, Long flightDuration, Airline airline, int totalSeats, String flightNumber) {
        this.id = id;
        this.basePrice = basePrice;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightDuration = flightDuration;
        this.airline = airline;
        this.totalSeats = totalSeats;
        this.flightNumber = flightNumber;
    }

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

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getTotalEconomyClassSeats() {
        return totalEconomyClassSeats;
    }

    public void setTotalEconomyClassSeats(int totalEconomyClassSeats) {
        this.totalEconomyClassSeats = totalEconomyClassSeats;
    }

    public int getAvailableEconomyClassSeats() {
        return availableEconomyClassSeats;
    }

    public void setAvailableEconomyClassSeats(int availableEconomyClassSeats) {
        this.availableEconomyClassSeats = availableEconomyClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return availableFirstClassSeats;
    }

    public void setAvailableFirstClassSeats(int availableFirstClassSeats) {
        this.availableFirstClassSeats = availableFirstClassSeats;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public void setTotalFirstClassSeats(int totalFirstClassSeats) {
        this.totalFirstClassSeats = totalFirstClassSeats;
    }

    public int getAvailableBusinessClassSeats() {
        return availableBusinessClassSeats;
    }

    public void setAvailableBusinessClassSeats(int availableBusinessClassSeats) {
        this.availableBusinessClassSeats = availableBusinessClassSeats;
    }

    public int getTotalBusinessClassSeats() {
        return totalBusinessClassSeats;
    }

    public void setTotalBusinessClassSeats(int totalBusinessClassSeats) {
        this.totalBusinessClassSeats = totalBusinessClassSeats;
    }
}
