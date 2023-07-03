package com.bms.bookmyshow.dtos;

import com.bms.bookmyshow.models.City;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateTheatreResponseDto {
    private String name;
    private String address;
    private String companyName;
    private City city;
}
