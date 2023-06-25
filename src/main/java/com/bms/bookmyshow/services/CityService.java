// package com.bms.bookmyshow.services;

// import org.modelmapper.ModelMapper;
// import org.springframework.beans.factory.annotation.Autowired;

// import com.bms.bookmyshow.dtos.CreateCityDto;
// import com.bms.bookmyshow.models.City;
// import com.bms.bookmyshow.repositories.interfaces.CityRepository;

// public class CityService {
    
//     @Autowired
//     private CityRepository cityRepository;

//     @Autowired
//     private ModelMapper modelMapper;

//     public City createCity(CreateCityDto request){
//         City newCity = modelMapper.map(request, City.class);
//         return cityRepository.save(newCity);
//     }

// }
