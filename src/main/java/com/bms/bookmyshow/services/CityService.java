package com.bms.bookmyshow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.dtos.CreateCityRequestDto;
import com.bms.bookmyshow.models.City;
import com.bms.bookmyshow.repositories.interfaces.CityRepository;

@Service
public class CityService {
    
    @Autowired
    private CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City createCity(CreateCityRequestDto request){
        City city = new City();
        city.setName(request.getName());
        city.setState(request.getState());
        city.setTheatres(request.getTheatres());
        return cityRepository.save(city);
    }

}
