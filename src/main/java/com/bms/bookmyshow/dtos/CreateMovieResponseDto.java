package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.Language;
import com.bms.bookmyshow.models.MovieFeature;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateMovieResponseDto {
    private String name;
    private Double duration;
    private Double rating;
    private List<Language> languages;
    private List<MovieFeature> movieFeatures;
}