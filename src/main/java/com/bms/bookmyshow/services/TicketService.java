package com.bms.bookmyshow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.dtos.CreateTicketRequestDto;
import com.bms.bookmyshow.models.ShowSeat;
import com.bms.bookmyshow.models.ShowSeatStatus;
import com.bms.bookmyshow.models.Ticket;
import com.bms.bookmyshow.models.TicketStatus;
import com.bms.bookmyshow.repositories.interfaces.ShowSeatRepository;
import com.bms.bookmyshow.repositories.interfaces.TicketRepository;

@Service
public class TicketService {
    
    @Autowired
    public TicketRepository ticketRepository;

    @Autowired
    public ShowSeatRepository showSeatRepository;

    public TicketService(TicketRepository ticketRepository, ShowSeatRepository showSeatRepository) {
        this.ticketRepository = ticketRepository;
        this.showSeatRepository = showSeatRepository;
    }

    public Ticket createTicket(CreateTicketRequestDto requestDto){
        Double amount = 0.0;
        for (ShowSeat showSeat : requestDto.getShowSeats()) {
            amount+=showSeat.getPrice();
            showSeat.setShowSeatStatus(ShowSeatStatus.BOOKED);

            showSeatRepository.save(showSeat);
        }
    
        Ticket ticket = new Ticket();
        ticket.setTicketStatus(TicketStatus.IN_PROCESS);
        ticket.setAmount(amount);
        ticket.setPayment(null);
        ticket.setShow(requestDto.getShow());
        ticket.setShowSeats(requestDto.getShowSeats());
        ticket.setUser(requestDto.getUser());

        return ticketRepository.save(ticket);
    }

}
