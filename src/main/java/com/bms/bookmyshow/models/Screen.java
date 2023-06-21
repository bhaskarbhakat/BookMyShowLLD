package com.bms.bookmyshow.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Screen extends BaseModel{
    private String name;
    private List<Seat> seats;
    private List<Show> shows;
    private List<Feature> features;
}
