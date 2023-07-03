package com.bms.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bookmyshow.dtos.CreateMovieRequestDto;
import com.bms.bookmyshow.dtos.CreateMovieResponseDto;
import com.bms.bookmyshow.models.Movie;
import com.bms.bookmyshow.services.MovieService;

@RestController
public class MovieController {
    
    @Autowired
    public MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public CreateMovieResponseDto createMovie(CreateMovieRequestDto request){
        Movie movie = movieService.createMovie(request);
        CreateMovieResponseDto responseDto = CreateMovieResponseDto.builder()
                                                                    .name(movie.getName())
                                                                    .duration(movie.getDuration())
                                                                    .rating(movie.getRating())
                                                                    .languages(movie.getLanguages())
                                                                    .movieFeatures(movie.getFeatures())
                                                                    .build();

        return responseDto;
    }
}
