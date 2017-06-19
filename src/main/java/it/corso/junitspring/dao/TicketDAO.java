package it.corso.junitspring.dao;

import java.util.List;

import it.corso.junitspring.dto.Ticket;

public interface TicketDAO {

	public int createTicket(Ticket ticket);
	public Ticket read(int ticketNo);
	public List<Ticket> readAll();
}
