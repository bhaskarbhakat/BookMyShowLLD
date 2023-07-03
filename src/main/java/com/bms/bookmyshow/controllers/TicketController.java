package com.bms.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bookmyshow.dtos.CreateTicketRequestDto;
import com.bms.bookmyshow.dtos.CreateTicketResponseDto;
import com.bms.bookmyshow.models.Ticket;
import com.bms.bookmyshow.services.TicketService;

@RestController
public class TicketController {
    
    @Autowired
    public TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public CreateTicketResponseDto createTicket(CreateTicketRequestDto requestDto){
        Ticket ticket = ticketService.createTicket(requestDto);
        CreateTicketResponseDto createTicketResponseDto = CreateTicketResponseDto.builder()
                                                                                 .amount(ticket.getAmount())
                                                                                 .show(ticket.getShow())
                                                                                 .payment(ticket.getPayment())
                                                                                 .showSeats(ticket.getShowSeats())
                                                                                 .ticketStatus(ticket.getTicketStatus())
                                                                                 .user(ticket.getUser())
                                                                                 .build();


        return createTicketResponseDto;
    }

}
