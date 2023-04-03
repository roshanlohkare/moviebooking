package com.ps.handson.moviebooking.entity;

import com.ps.handson.moviebooking.example.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Person {

    @Id
    private  long id;

    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;

}
