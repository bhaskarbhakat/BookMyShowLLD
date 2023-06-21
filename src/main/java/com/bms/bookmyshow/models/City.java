package com.bms.bookmyshow.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
    private String name;
    private List<Theatre> theatres;
    
}
