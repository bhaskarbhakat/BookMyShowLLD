package com.bms.bookmyshow.services;

import java.util.List;
import com.bms.bookmyshow.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.dtos.CreateUserDto;
import com.bms.bookmyshow.models.User;
import com.bms.bookmyshow.repositories.interfaces.UserRepository;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User createUser(CreateUserDto userDto){
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        userRepository.save(user);

        return user;
    }

    public User getUser(Long id){
        return userRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("User not found with ID: " + id));
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
