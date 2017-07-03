package it.corso.junitspring.service;

import java.util.List;

import it.corso.junitspring.dto.Ticket;

public interface TicketService {

	int buyTicket(String passengerName, String phone);

	Ticket getTicket(int tickNo);

	List<Ticket> getAllTickets();
	
}
