package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Offer {
    @Id
    private long id;

    private String name;

    private int discount;

    private List<City> eligibleCities;

    private List<Theater> eligibleTheaters;
}
