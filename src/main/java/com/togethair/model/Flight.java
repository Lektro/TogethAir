package com.togethair.model;

import javax.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column
    private Airport departureAirport;

    @Column
    private Airport arrivalAirport;




}
