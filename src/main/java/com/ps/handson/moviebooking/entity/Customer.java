package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer extends Person{

    @Id
    private long customerId;

    private Address address;

    private Contact contact ;

    private Preference preference;

}
//Ref: posts.user_id > users.id // many-to-one
//
//        Ref: users.id < follows.following_user_id
//
//        Ref: users.id < follows.followed_user_id