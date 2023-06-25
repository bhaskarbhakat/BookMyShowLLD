package com.bms.bookmyshow.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Screen extends BaseModel{
    private Integer screenNumber;

    @OneToMany
    private List<Seat> seats = new ArrayList<>();
}
