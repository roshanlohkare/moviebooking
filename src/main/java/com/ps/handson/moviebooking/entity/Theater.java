package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Theater {

    @Id
    private long id;

    private String name;

    private Address address ;

    private List<Auditorium> auditoriumList;

    private int totalAuditorium;
}
