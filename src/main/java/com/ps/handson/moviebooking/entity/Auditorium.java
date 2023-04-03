package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Auditorium {

    @Id
    private long id;

    private String name;

    private Theater theater;

    private Movie movie;

    private ShowTime showTime;

    private List<Seat> seatList;

    private int capacity;
}
