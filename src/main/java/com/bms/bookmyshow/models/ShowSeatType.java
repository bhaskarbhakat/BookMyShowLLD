package com.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType {
    private Show show;
    private double price;
    private SeatType seatType;
}
