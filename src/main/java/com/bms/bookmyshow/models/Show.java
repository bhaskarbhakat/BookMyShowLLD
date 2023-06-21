package com.bms.bookmyshow.models;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show extends BaseModel{
    private Screen screen;
    private Movie movie;
    private Date startTime;
    private Date endTime;
    private Theatre theatre;
    private List<Feature> features;
}
