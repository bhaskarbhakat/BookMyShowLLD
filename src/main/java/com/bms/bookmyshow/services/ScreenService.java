package com.bms.bookmyshow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.dtos.CreateScreenRequestDto;
import com.bms.bookmyshow.models.Screen;
import com.bms.bookmyshow.models.Seat;
import com.bms.bookmyshow.models.SeatType;
import com.bms.bookmyshow.repositories.interfaces.ScreenRepository;
import com.bms.bookmyshow.repositories.interfaces.SeatRepository;

@Service
public class ScreenService {

    @Autowired
    public ScreenRepository screenRepository;

    @Autowired
    public SeatRepository seatRepository;
    
    public ScreenService(ScreenRepository screenRepository, SeatRepository seatRepository) {
        this.screenRepository = screenRepository;
        this.seatRepository = seatRepository;
    }

    public Screen createScreen(CreateScreenRequestDto request){
        Screen screen = new Screen();
        screen.setScreenNumber(request.getScreenNumber());
        List<Seat> seats = new ArrayList<>(); 
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                Seat seat = new Seat();
                seat.setRowNumber(i);
                seat.setColNumber(j);
                seat.setType(SeatType.DIAMOND);

                seats.add(seat);
                seatRepository.save(seat);
            }
        }

        screen.setSeats(seats);

        return screenRepository.save(screen);
    }
}
