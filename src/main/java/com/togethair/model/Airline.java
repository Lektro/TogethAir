package com.togethair.model;

//extra info about the specific airline companies

import javax.persistence.*;

@Entity
@Table(name = "airline", schema = "togethair")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;


}
