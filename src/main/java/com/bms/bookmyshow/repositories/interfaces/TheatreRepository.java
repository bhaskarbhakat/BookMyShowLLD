package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bookmyshow.models.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {
        
}
