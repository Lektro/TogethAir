package com.togethair.model;

import javax.persistence.*;

@Entity
@Table(name = "ticket", schema = "togethair")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;




}
