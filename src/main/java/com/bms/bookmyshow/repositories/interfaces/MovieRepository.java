package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bookmyshow.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
    
}
