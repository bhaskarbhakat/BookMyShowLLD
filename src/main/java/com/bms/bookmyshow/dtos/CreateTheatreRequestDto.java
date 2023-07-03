package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.City;
import com.bms.bookmyshow.models.Screen;
import com.bms.bookmyshow.models.Show;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTheatreRequestDto {
    private String name;
    private String address;
    private String companyName;
    private City city;
    private List<Screen> screens;
    private List<Show> shows;
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
