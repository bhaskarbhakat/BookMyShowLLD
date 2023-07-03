package com.bms.bookmyshow.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.bms.bookmyshow.models.User;

@Controller
public interface UserRepository extends JpaRepository<User, Long>{
    
}
