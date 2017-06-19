package it.corso.junitspring.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import it.corso.junitspring.configuration.ApplicationContextConfig;
import it.corso.junitspring.dao.TicketDAO;
import it.corso.junitspring.dto.Ticket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationContextConfig.class})
@WebAppConfiguration
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
	
	/**
	 * MOck tickets
	 * List<Ticket> l = new ArrayList<>();
		Ticket t = new Ticket();
		t.setPassengerName("Thimoty");
		t.setPhone("1234");
		l.add(t);
		t = new Ticket();
		t.setPassengerName("Thomas");
		t.setPhone("1235");
		l.add(t);
		t = new Ticket();
		t.setPassengerName("Percy");
		t.setPhone("1236");
		l.add(t);
		t = new Ticket();
		t.setPassengerName("Gordon");
		t.setPhone("1237");
		l.add(t);
	 */

}
