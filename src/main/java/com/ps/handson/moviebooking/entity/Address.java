package com.ps.handson.moviebooking.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    private long id;

    private String address1;
    private String address2;
    private String address3;
    private City city;
    private State state;
    private Country country;
    private String pinCode;
}
