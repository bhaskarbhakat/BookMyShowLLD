package com.bms.bookmyshow.models;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket extends BaseModel{
    private Show show;
    private List<ShowSeat> showSeats;
    private List<Payment> payments;
    private TicketStatus ticketStatus;
    private Date bookingTime;
    private double amount;
}
