package it.corso.junitspring.dao;

import java.util.List;

import it.corso.junitspring.dto.Ticket;

public interface TicketDAO {

	public int save(Ticket ticket);
	public Ticket read(int tickNo);
	public List<Ticket> findAll();
	
}
