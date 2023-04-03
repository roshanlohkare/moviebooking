package com.ps.handson.moviebooking.controller;

import com.ps.handson.moviebooking.entity.Offer;
import com.ps.handson.moviebooking.repository.OfferRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController("/api/v1/offer")
@AllArgsConstructor
public class OfferController {

    OfferRepository offerRepository ;

    @GetMapping("/thirdTicketOffer")
    public List<Offer> getOffers(@RequestParam long cityId, @RequestParam long theaterId, @RequestParam LocalDate date) {

        return offerRepository.findByEligibleCitiesIdAndEligibleTheatersId(cityId, theaterId);
    }
}
