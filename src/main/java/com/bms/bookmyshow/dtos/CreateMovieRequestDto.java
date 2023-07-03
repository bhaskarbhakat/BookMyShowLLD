package com.bms.bookmyshow.dtos;


import java.util.ArrayList;
import java.util.List;

import com.bms.bookmyshow.models.Language;
import com.bms.bookmyshow.models.MovieFeature;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMovieRequestDto {
    private String name;
    private Double duration;
    private Double rating;
    private List<Language> languages = new ArrayList<>();
    private List<MovieFeature> movieFeatures = new ArrayList<>();
}


    // private String name;
    // private Double duration;
    // private Double rating;

    // @ElementCollection
    // @Enumerated
    // private List<Language> Languages = new ArrayList<>();

    // @ElementCollection
    // @Enumerated
    // private List<MovieFeature> features = new ArrayList<>();