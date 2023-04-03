package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movie {

    @Id
    private long id;

    private String  name;

    private String language;

    private String genre ;
}
