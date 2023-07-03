package com.bms.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bookmyshow.dtos.CreateTheatreRequestDto;
import com.bms.bookmyshow.dtos.CreateTheatreResponseDto;
import com.bms.bookmyshow.models.Theatre;
import com.bms.bookmyshow.services.TheatreService;

@RestController
public class TheatreController {

    @Autowired
    public TheatreService theatreService;

    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    public CreateTheatreResponseDto createTheatre(CreateTheatreRequestDto requestDto){
        Theatre theatre = theatreService.createTheatre(requestDto);
        CreateTheatreResponseDto response = CreateTheatreResponseDto.builder()
                                                                    .name(theatre.getName())
                                                                    .address(theatre.getAddress())
                                                                    .city(theatre.getCity())
                                                                    .companyName(theatre.getCompanyName())
                                                                    .build();
        return response;
    }
}

// private String name;
// private String address;
// private String companyName;

// @ManyToOne
// private City city;

// @OneToMany
// private List<Screen> screens;

// @OneToMany
// private List<Show> shows;
