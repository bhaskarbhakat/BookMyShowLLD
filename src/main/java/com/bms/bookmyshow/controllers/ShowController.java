package com.bms.bookmyshow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bookmyshow.dtos.CreateShowRequestDto;
import com.bms.bookmyshow.dtos.CreateShowResponseDto;
import com.bms.bookmyshow.models.Show;
import com.bms.bookmyshow.models.User;
import com.bms.bookmyshow.services.ShowService;

@RestController
public class ShowController {
    
    @Autowired
    public ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }
    
    public CreateShowResponseDto createShow(CreateShowRequestDto requestDto){
        Show show = showService.createShow(requestDto);
        CreateShowResponseDto response = CreateShowResponseDto.builder()
                                                              .language(show.getLanguage())
                                                              .endTime(show.getEndTime())
                                                              .movie(show.getMovie())
                                                              .movieFeatures(show.getMovieFeatures())
                                                              .startTime(show.getStartTime())
                                                              .screen(show.getScreen())
                                                              .build();

        return response;
    }

    @GetMapping("/shows")
    public List<Show> getShows(){
        return showService.getShows();
    }
}
