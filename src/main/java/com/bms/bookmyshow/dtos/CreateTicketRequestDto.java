package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.Show;
import com.bms.bookmyshow.models.ShowSeat;
import com.bms.bookmyshow.models.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTicketRequestDto {
    private Show show;
    private User user;
    private List<ShowSeat> showSeats;
}


// private Show show;
// private User user;
// private List<ShowSeat> showSeats;
// private Double amount;
// private TicketStatus ticketStatus;
// private Payment payment;