package com.bms.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class Theatre extends BaseModel {
    @Id
    private String name;
    private String address;
    private String companyName;

    @ManyToOne
    private City city;

    @OneToMany
    private List<Screen> screens;

    @OneToMany
    private List<Show> shows;

}
