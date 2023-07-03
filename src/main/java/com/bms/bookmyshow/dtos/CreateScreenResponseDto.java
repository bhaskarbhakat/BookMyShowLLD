package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.Seat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateScreenResponseDto {

    private Integer screenNumber;
    private List<Seat> seats;
}
