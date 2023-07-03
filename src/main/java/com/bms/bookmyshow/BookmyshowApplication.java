package com.bms.bookmyshow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bms.bookmyshow.controllers.UserController;
import com.bms.bookmyshow.dtos.CreateUserDto;

@SpringBootApplication
public class BookmyshowApplication implements CommandLineRunner{

	@Autowired
	public UserController userController;

	
	public BookmyshowApplication(UserController userController) {
		this.userController = userController;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookmyshowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		CreateUserDto userRequest = new CreateUserDto();
		userRequest.setEmail("abhishek@gmail.com");
		userRequest.setName("Abhishek");

		// userController.createUser(userRequest);
	}
	

}
