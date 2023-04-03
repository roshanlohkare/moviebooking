package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class ShowTime {

    @Id
    private long id;
    
    private LocalDate date;
    
    private LocalDateTime startTime ;
    
    private LocalDateTime endTime ;
    
    
}
