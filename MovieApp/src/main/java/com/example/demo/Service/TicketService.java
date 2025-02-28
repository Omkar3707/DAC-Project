package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Ticket;
import com.example.demo.Repository.TicketRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;
	public Ticket bookTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	public String generateETicket(Ticket ticket) {
	    return "E-Ticket for booking ID: " + ticket.getId();
	}

}
