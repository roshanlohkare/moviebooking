package com.ps.handson.moviebooking.repository;

import com.ps.handson.moviebooking.entity.Offer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OfferRepository extends CrudRepository<Offer, Long> {
    List<Offer> findByEligibleCitiesIdAndEligibleTheatersId(long cityId, long theaterId);
}
