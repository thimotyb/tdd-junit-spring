package it.corso.junitspring.dao;

import org.springframework.stereotype.Component;

import it.corso.junitspring.dto.Ticket;
 
@Component
public class TicketDAOImpl implements TicketDAO {

	@Override
	public int createTicket(Ticket ticket) {
		// Obvious Implementation
		return 1;
	}

}
