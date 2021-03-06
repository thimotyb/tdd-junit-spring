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
		return dao.createTicket(ticket);
	}

	public TicketDAO getDao() {
		return dao;
	}

	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

	@Override
	public Ticket getTicket(String tickNo) {
		return dao.read(new Integer(tickNo));
	}

	@Override
	public List<Ticket> getAllTickets() {		
		return dao.readAll();
	}

}
