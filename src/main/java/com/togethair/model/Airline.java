package com.togethair.model;

import javax.persistence.*;

@Entity
@Table(name = "airline", schema = "togethair")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    /// extra fields for HQ address etc?
    @Column(nullable = false, length = 256)
    private String companyDetails;

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

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyDetails='" + companyDetails + '\'' +
                '}';
    }
}
