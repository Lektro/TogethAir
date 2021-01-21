package com.togethair.model;

import javax.persistence.*;
import java.util.Objects;

// Make a booking class so you can keep track off multiple tickets
@Entity
@Table(name = "ticket", schema = "togethair")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    // user or customer needs to be created on the fly first.
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "payment_status", columnDefinition="tinyint(1) default 0")
    private Boolean paymentStatus;

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

    public Boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
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
