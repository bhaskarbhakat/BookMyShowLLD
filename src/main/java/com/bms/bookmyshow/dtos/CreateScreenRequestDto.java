package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.Seat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateScreenRequestDto {

    private Integer screenNumber;
    private List<Seat> seats;
}

    // private Integer screenNumber;

    // @OneToMany
    // private List<Seat> seats = new ArrayList<>();
