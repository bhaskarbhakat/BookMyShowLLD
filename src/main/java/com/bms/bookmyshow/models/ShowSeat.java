package com.bms.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat {
    private Show show;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
