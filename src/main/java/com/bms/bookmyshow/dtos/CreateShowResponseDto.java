package com.bms.bookmyshow.dtos;

import java.sql.Date;
import java.util.List;

import com.bms.bookmyshow.models.Language;
import com.bms.bookmyshow.models.Movie;
import com.bms.bookmyshow.models.MovieFeature;
import com.bms.bookmyshow.models.Screen;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateShowResponseDto {
    private Movie movie;
    private Language language;
    private Date startTime;
    private Date endTime;
    private Screen screen;
    private List<MovieFeature> movieFeatures;
}
