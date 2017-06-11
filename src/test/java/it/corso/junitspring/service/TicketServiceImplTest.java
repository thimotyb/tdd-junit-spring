package it.corso.junitspring.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.corso.junitspring.dao.TicketDAO;
import it.corso.junitspring.dto.Ticket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TicketServiceImplTest {

	@Mock
	TicketDAO dao;
	
	@Autowired
	@InjectMocks
	TicketServiceImpl service;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldCreateNewTicket() {

		when(dao.createTicket(any(Ticket.class))).thenReturn(1);
		int result = service.buyTicket("Thimoty", "1234");
		assertEquals(1, result);
		
	}

}
