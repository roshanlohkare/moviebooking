package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Seat {

    @Id
    private long id ;

    private String rowNum ;
    private String seatNum ;

    private boolean available;

}
