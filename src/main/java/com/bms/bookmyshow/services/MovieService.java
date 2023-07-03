package com.bms.bookmyshow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.dtos.CreateMovieRequestDto;
import com.bms.bookmyshow.models.Movie;
import com.bms.bookmyshow.repositories.interfaces.MovieRepository;

@Service
public class MovieService {
    
    @Autowired
    public MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(CreateMovieRequestDto request){
        Movie movie = new Movie();
        movie.setName(request.getName());
        movie.setDuration(request.getDuration());
        movie.setRating(request.getRating());
        movie.setLanguages(request.getLanguages());
        movie.setFeatures(request.getMovieFeatures());

        movieRepository.save(movie);
        return movie;
    }
}
