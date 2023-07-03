package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bookmyshow.models.ShowSeat;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    
}
