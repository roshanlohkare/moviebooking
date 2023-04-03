package com.ps.handson.moviebooking.repository;

import com.ps.handson.moviebooking.entity.Theater;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TheaterRepository extends CrudRepository<Theater, Long> {

    List<Theater> findByAddressCityName(String cityName);
}
