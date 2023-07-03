package com.bms.bookmyshow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.dtos.CreateTheatreRequestDto;
import com.bms.bookmyshow.models.Theatre;
import com.bms.bookmyshow.repositories.interfaces.TheatreRepository;

@Service
public class TheatreService {
    
    @Autowired
    public TheatreRepository theatreRepository;

    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    public Theatre createTheatre(CreateTheatreRequestDto requestDto){
        Theatre theatre = new Theatre();
        theatre.setName(requestDto.getName());
        theatre.setCompanyName(requestDto.getCompanyName());
        theatre.setAddress(requestDto.getAddress());
        theatre.setScreens(requestDto.getScreens());
        theatre.setShows(requestDto.getShows());
        return theatreRepository.save(theatre);
    }
}
