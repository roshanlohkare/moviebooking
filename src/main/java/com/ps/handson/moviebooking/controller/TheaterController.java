package com.ps.handson.moviebooking.controller;

import com.ps.handson.moviebooking.entity.Theater;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@RestController("/api/v1/theater")
@AllArgsConstructor
public class TheaterController {

    @GetMapping("/theatersForMovieInCity")
    public List<Theater> getTheaters(@RequestParam long cityId, @RequestParam long movieId, @RequestParam  LocalDate date){
        return Collections.emptyList();
    }

    @PutMapping("/onboard")
    public ResponseEntity<String> onboardTheater(@RequestBody Theater theater){
        return ResponseEntity.ok("Success");
    }
}
