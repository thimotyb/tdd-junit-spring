package it.corso.junitspring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import it.corso.junitspring.dto.Ticket;
 
@Repository
@Transactional
public class TicketDAOImpl implements TicketDAO {


	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public int save(Ticket ticket) {
		entityManager.persist(ticket);
		return ticket.getTicketNumber();
	}

	@Override
	public Ticket read(int tickNo) {
		return entityManager.find(Ticket.class, new Integer(tickNo));
	}

	@Override
	public List<Ticket> findAll() {		
		return entityManager.createQuery("from Ticket", Ticket.class).getResultList();
	}

}
