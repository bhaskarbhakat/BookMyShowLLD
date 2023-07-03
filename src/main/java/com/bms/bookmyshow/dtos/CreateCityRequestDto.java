package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.Theatre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCityRequestDto {
    private String name;
    private String state;
    private List<Theatre> theatres;
}


    // private String name;
    // private String state;

    // @OneToMany(mappedBy = "city")
    // private List<Theatre> theatres;