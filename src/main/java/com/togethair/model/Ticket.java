package com.togethair.model;

import javax.persistence.*;

// ticket or reservation not sure, we need to add multiple seats for one booking
@Entity
@Table(name = "ticket", schema = "togethair")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false,length = 100)
    private transient Airline airline;

    @Column(nullable = false,length = 100)
    private transient Airport departureAirport;

    @Column(nullable = false,length = 100)
    private transient Airport arrivalAirport;

    @Column(nullable = false,length = 100)
    private transient Flight flightDuration;



}
