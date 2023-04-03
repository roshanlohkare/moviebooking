package com.ps.handson.moviebooking.repository;

import com.ps.handson.moviebooking.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
