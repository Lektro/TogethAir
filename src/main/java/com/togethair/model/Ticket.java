package com.togethair.model;

import javax.persistence.*;
import java.util.Objects;

// ticket or reservation not sure, we need to add multiple seats for one booking
@Entity
@Table(name = "ticket", schema = "togethair")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(length = 100)
    private transient Airline airline;

    @Column(length = 100)
    @Transient
    private Airport departureAirport;

    @Column(length = 100)
    @Transient
    private Airport arrivalAirport;

    @Column(length = 100)
    @Transient
    private Flight flightDuration;

    public Ticket () {}

    public Ticket(Airline airline, Airport departureAirport, Airport arrivalAirport, Flight flightDuration) {
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightDuration = flightDuration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
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

    public Flight getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Flight flightDuration) {
        this.flightDuration = flightDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getId().equals(ticket.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", airline=" + airline +
                ", departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", flightDuration=" + flightDuration +
                '}';
    }
}
