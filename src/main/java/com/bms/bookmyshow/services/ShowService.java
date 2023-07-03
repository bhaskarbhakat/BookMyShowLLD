package com.bms.bookmyshow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.dtos.CreateShowRequestDto;
import com.bms.bookmyshow.models.Seat;
import com.bms.bookmyshow.models.Show;
import com.bms.bookmyshow.models.ShowSeat;
import com.bms.bookmyshow.models.ShowSeatStatus;
import com.bms.bookmyshow.repositories.interfaces.ShowRepository;
import com.bms.bookmyshow.repositories.interfaces.ShowSeatRepository;

@Service
public class ShowService {
    
    @Autowired
    public ShowRepository showRepository;

    @Autowired
    public ShowSeatRepository showSeatRepository;

    public ShowService(ShowRepository showRepository, ShowSeatRepository showSeatRepository) {
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }


    public Show createShow(CreateShowRequestDto requestDto){
        Show show = new Show();
        show.setMovie(requestDto.getMovie());
        show.setLanguage(requestDto.getLanguage());
        show.setEndTime(requestDto.getEndTime());
        show.setStartTime(requestDto.getStartTime());
        show.setMovieFeatures(requestDto.getMovieFeatures());
        show.setScreen(requestDto.getScreen());

        List<ShowSeat> showSeats = new ArrayList<>();
        for (Seat seat : requestDto.getScreen().getSeats()) {
            ShowSeat showSeat = new ShowSeat();
            showSeat.setSeat(seat);
            showSeat.setPrice(200.0);
            showSeat.setShowSeatStatus(ShowSeatStatus.AVAILABLE);

            showSeatRepository.save(showSeat);
        }

        show.setShowSeats(showSeats);
        
        return showRepository.save(show);
    }

    public List<Show> getShows(){
        return showRepository.findAll();
    }
}
