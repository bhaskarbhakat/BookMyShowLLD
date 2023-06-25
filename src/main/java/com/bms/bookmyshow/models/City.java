package com.bms.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class City extends BaseModel {
    private String name;
    private String state;

    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres;

}
