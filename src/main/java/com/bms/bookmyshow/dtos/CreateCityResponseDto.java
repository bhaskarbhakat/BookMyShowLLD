package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.Theatre;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CreateCityResponseDto {
    private String name;
    private String state;
    private List<Theatre> theatres;
}
