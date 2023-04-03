package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Contact {

    @Id
    private long id;

    private String emailId;
    private String phoneNumber;
    private String faxAddress;

}
