package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bookmyshow.models.Seat;

public interface SeatRepository extends JpaRepository<Seat,Long>{
    
}
