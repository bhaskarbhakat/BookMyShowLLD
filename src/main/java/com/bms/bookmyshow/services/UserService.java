package com.bms.bookmyshow.services;

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
}
