package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TheaterPartner  extends Person{
    @Id
    private long id;

    private Address address;

    private Contact contact ;

    private Theater theater;
}
