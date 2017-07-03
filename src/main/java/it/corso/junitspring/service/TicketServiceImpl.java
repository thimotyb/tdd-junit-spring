package it.corso.junitspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.corso.junitspring.dao.TicketDAO;
import it.corso.junitspring.dto.Ticket;

@Component
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao;
	
	@Override
	public int buyTicket(String passengerName, String phone) {		
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);
		ticket.setPhone(phone);
		return dao.save(ticket);
	}

		@Override
	public Ticket getTicket(int tickNo) {
			return dao.read(tickNo);
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}

}
