package com.bms.bookmyshow.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show extends BaseModel{  
    
    @ManyToOne
    private Movie movie;

    @Enumerated
    private Language language;

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    @ElementCollection
    private List<MovieFeature> movieFeatures = new ArrayList<>();

    @OneToMany
    private List<ShowSeat> showSeats = new ArrayList<>();
}
