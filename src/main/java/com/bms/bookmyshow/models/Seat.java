package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Seat extends BaseModel{
    private Integer rowNumber;
    private Integer colNumber;

    @Enumerated
    private SeatType type;
}
