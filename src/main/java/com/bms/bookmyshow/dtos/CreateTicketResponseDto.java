package com.bms.bookmyshow.dtos;

import java.util.List;

import com.bms.bookmyshow.models.Payment;
import com.bms.bookmyshow.models.Show;
import com.bms.bookmyshow.models.ShowSeat;
import com.bms.bookmyshow.models.TicketStatus;
import com.bms.bookmyshow.models.User;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateTicketResponseDto {    
    private Show show;
    private User user;
    private List<ShowSeat> showSeats;
    private Double amount;
    private TicketStatus ticketStatus;
    private Payment payment;
}



// private Show show;
// private User user;
// private List<ShowSeat> showSeats;
// private Double amount;
// private TicketStatus ticketStatus;
// private Payment payment;