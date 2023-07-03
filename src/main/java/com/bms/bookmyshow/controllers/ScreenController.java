package com.bms.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bookmyshow.dtos.CreateScreenRequestDto;
import com.bms.bookmyshow.dtos.CreateScreenResponseDto;
import com.bms.bookmyshow.models.Screen;
import com.bms.bookmyshow.services.ScreenService;

@RestController
public class ScreenController {
    
    @Autowired
    public ScreenService screenService;

    public ScreenController(ScreenService screenService) {
        this.screenService = screenService;
    }

    public CreateScreenResponseDto createScreen(CreateScreenRequestDto requestDto){
        Screen screen = screenService.createScreen(requestDto);

        CreateScreenResponseDto responseDto = new CreateScreenResponseDto();
        requestDto.setScreenNumber(screen.getScreenNumber());
        requestDto.setSeats(screen.getSeats());
        return responseDto;
    }

}
