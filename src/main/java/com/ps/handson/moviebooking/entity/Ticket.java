package com.ps.handson.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Ticket {

    @Id
    private long id;

    private Movie movie ;
    private Customer customer;
    private Theater theater;
    private Auditorium auditorium;
    private Seat seat;
    private ShowTime showTime;
    private Offer offer;

    private double price ;

    private LocalDate bookingDate;

}
/*

Ref: "Ticket"."movie_id" - "Movie"."id"

Ref: "Ticket"."customer_id" - "Customer"."id"

Ref: "Ticket"."theater_id" - "Theater"."id"

Ref: "Ticket"."auditorium_id" - "Auditorium"."id"

Ref: "Ticket"."seat_id" < "Seat"."id"

Ref: "Ticket"."showtime_id" - "ShowTime"."id"

Ref: "Ticket"."offer_id" - "Offer"."id"





 */