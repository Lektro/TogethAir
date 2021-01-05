package com.togethair.model;

import javax.persistence.*;

@Entity
@Table(name = "flight", schema = "togethair")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private Long basePrice;

    @Column(nullable = false)
    private transient Airport departureAirport;

    @Column(nullable = false)
    private transient Airport arrivalAirport;

    @Column(nullable = false)
    private Long estimatedFlightDuration;

/*    @Column
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="airport_id")
    private Airport departureAirport;

    @Column
    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="airport_id")
    private Airport arrivalAirport;

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
    }*/
}
