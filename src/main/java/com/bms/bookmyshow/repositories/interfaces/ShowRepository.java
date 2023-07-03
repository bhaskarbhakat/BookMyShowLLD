package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bookmyshow.models.Show;

public interface ShowRepository extends JpaRepository<Show,Long>{

}
