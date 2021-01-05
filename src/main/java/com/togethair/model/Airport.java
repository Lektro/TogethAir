package com.togethair.model;

import javax.persistence.*;

@Entity(name = "airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(nullable = false,length = 100)
    private String country;

    @Column(nullable = false,length = 100)
    private String region;
}
