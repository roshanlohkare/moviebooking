package com.ps.handson.moviebooking.controller;

import com.ps.handson.moviebooking.entity.Movie;
import com.ps.handson.moviebooking.repository.MovieRepository;
import com.ps.handson.moviebooking.repository.TheaterRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController("/api/v1/movie")
@AllArgsConstructor
public class MovieController {

    MovieRepository movieRepository;
    TheaterRepository theaterRepository;

    @GetMapping("/moviesInCity")
    public List<Movie> getMovies(@RequestParam String cityName, @RequestParam LocalDate date) {
        List<Movie> movies = new ArrayList<>();

        theaterRepository.findByAddressCityName(cityName).stream()
                .forEach(theater ->
                {
                    theater.getAuditoriumList().stream()
                            .filter(auditorium -> date.equals(auditorium.getShowTime().getDate()))
                            .forEach(auditorium -> movies.add(auditorium.getMovie()));
                });
        return movies;
    }
}
