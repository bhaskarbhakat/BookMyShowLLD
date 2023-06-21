package com.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {
    private String name;
    private int row;
    private int col;
    private SeatType seatType;
}
