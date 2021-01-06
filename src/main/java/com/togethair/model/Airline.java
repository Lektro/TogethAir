package com.togethair.model;

//extra info about the specific airline companies

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "airline", schema = "togethair")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(length = 256)
    private String companyDetails;

    @OneToMany
    private Set<Ticket> ticketSet;

    @OneToMany
    private Set<Flight> flightSet;

    public Airline(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Airline() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(String companyDetails) {
        this.companyDetails = companyDetails;
    }

    public Set<Ticket> getTicketSet() {
        return ticketSet;
    }

    public void setTicketSet(Set<Ticket> ticketSet) {
        this.ticketSet = ticketSet;
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }

    public void setFlightSet(Set<Flight> flightSet) {
        this.flightSet = flightSet;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyDetails='" + companyDetails + '\'' +
                '}';
    }
}
