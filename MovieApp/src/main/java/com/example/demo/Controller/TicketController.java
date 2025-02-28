package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Ticket;
import com.example.demo.Service.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
	@Autowired
	private TicketService ticketService;
	@PostMapping
	public Ticket bookTicket(@RequestBody Ticket ticket) {
		return ticketService.bookTicket(ticket);
	}

}
