package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bookmyshow.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
