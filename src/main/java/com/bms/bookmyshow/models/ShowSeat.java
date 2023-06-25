package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Seat seat;

    @Enumerated
    private ShowSeatStatus showSeatStatus;

    private Double price;
}
