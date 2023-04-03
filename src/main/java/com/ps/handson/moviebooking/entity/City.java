package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class City {

    @Id
    private long id;

    private String name;
    private String cityCode;
    private Country country;
    private State state;
}
