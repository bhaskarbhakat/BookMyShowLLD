package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bookmyshow.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
