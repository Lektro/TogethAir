package com.togethair.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight", schema = "togethair")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    private double basePrice;

    private double advertisedPrice;

    private double employeeOverridePrice;

//    ook hier is de cascadetype.refresh heel belangrijk
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name="fk_departure_airport_id")
    // Naamgeving moet hetzelfde zijn in je Angular Model
    private Airport departureAirport;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name="fk_arrival_airport_id")
    private Airport arrivalAirport;

    @Column(nullable = false)
    private Long flightDuration;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name="fk_airline_id")
    private Airline airline;

    // vital for prototype but needs to be split into separate travel classes and figure out how to keep track of stock
    private int totalSeats;

    // use formula to calc remaining seats, hardcoded for now since we need to get the amount of sold tickets from the database //
    @Formula("TOTAL_SEATS - 5")
    private int totalAvailableSeats;

    private int totalEconomyClassSeats;

    private int availableEconomyClassSeats;

    private int availableFirstClassSeats;

    private int totalFirstClassSeats;

    private int availableBusinessClassSeats;

    private int totalBusinessClassSeats;

    @Column(nullable = false)
    private String flightNumber;

    @Column(name = "departure_time", columnDefinition = "DATETIME")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate departureTime;

    @Column(name = "arrival_time", columnDefinition = "DATETIME")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate arrivalTime;

    public Flight() {
    }

    public Flight(Long id, Airport departureAirport, Airport arrivalAirport, Long flightDuration, Airline airline, int totalSeats, int availableSeats, int totalEconomyClassSeats, int availableEconomyClassSeats, int availableFirstClassSeats, int totalFirstClassSeats, int availableBusinessClassSeats, int totalBusinessClassSeats, String flightNumber, LocalDate departureTime, LocalDate arrivalTime) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightDuration = flightDuration;
        this.airline = airline;
        this.totalSeats = totalSeats;
        this.totalAvailableSeats = availableSeats;
        this.totalEconomyClassSeats = totalEconomyClassSeats;
        this.availableEconomyClassSeats = availableEconomyClassSeats;
        this.availableFirstClassSeats = availableFirstClassSeats;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.availableBusinessClassSeats = availableBusinessClassSeats;
        this.totalBusinessClassSeats = totalBusinessClassSeats;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDate departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDate getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDate arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getTotalAvailableSeats() {
        return totalAvailableSeats;
    }

    public void setTotalAvailableSeats(int availableSeats) {
        this.totalAvailableSeats = availableSeats;
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

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getAdvertisedPrice() {
        return advertisedPrice;
    }

    //@Formula("basePrice * 1,10")
    //Hibernate Interceptor needed here ,, do your calculations in your service class with a dto please
    public void setAdvertisedPrice(double advertisedPrice) {
        this.advertisedPrice = advertisedPrice;
    }

    public double getEmployeeOverridePrice() {
        return employeeOverridePrice;
    }

    // to make sure employees do not give too much discounts doubles have their own issue in SQL DB however !!!
    public void setEmployeeOverridePrice(double employeeOverridePrice) {
        this.employeeOverridePrice = employeeOverridePrice;
    }

}
