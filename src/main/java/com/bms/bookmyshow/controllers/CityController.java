package com.bms.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bookmyshow.dtos.CreateCityRequestDto;
import com.bms.bookmyshow.dtos.CreateCityResponseDto;
import com.bms.bookmyshow.models.City;
import com.bms.bookmyshow.services.CityService;

@RestController
public class CityController {

    @Autowired
    public CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/city")
    public CreateCityResponseDto createCity(@RequestBody CreateCityRequestDto requestDto){
        City city = cityService.createCity(requestDto);
        CreateCityResponseDto responseDto = CreateCityResponseDto.builder()
                                                                .name(city.getName())
                                                                .state(city.getState())
                                                                .theatres(city.getTheatres())
                                                                .build();
        return responseDto;
    }

}
