package com.togethair.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

// ticket or reservation not sure, we need to add multiple seats for one booking
@Entity
@Table(name = "ticket", schema = "togethair")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "flight_id")
    private  Flight flight;

    // user or customer
    @OneToOne
    private User user;

    public Ticket() {}

    public Ticket(Long id, Flight flight, User user) {
        this.id = id;
        this.flight = flight;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getId().equals(ticket.getId()) && getFlight().equals(ticket.getFlight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFlight());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", flight=" + flight +
                ", user=" + user +
                '}';
    }
}
