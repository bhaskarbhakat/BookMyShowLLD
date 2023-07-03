package com.bms.bookmyshow.dtos;

import java.sql.Date;
import java.util.List;

import com.bms.bookmyshow.models.Language;
import com.bms.bookmyshow.models.Movie;
import com.bms.bookmyshow.models.MovieFeature;
import com.bms.bookmyshow.models.Screen;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateShowRequestDto {
    private Movie movie;
    private Language language;
    private Date startTime;
    private Date endTime;
    private Screen screen;
    private List<MovieFeature> movieFeatures;
}

// @ManyToOne
// private Movie movie;

// @Enumerated
// private Language language;

// private Date startTime;
// private Date endTime;

// @ManyToOne
// private Screen screen;

// @ElementCollection
// private List<MovieFeature> movieFeatures = new ArrayList<>();

// @OneToMany
// private List<ShowSeat> showSeats = new ArrayList<>();