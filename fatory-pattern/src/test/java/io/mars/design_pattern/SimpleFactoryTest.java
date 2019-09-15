package io.mars.design_pattern;

import io.mars.design_pattern.factory.simple_factory.SimpleFactory;
import io.mars.design_pattern.modules.Ticket;
import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

  @Test
  void simpleFactoryTest() {
    SimpleFactory ticketFactory = new SimpleFactory();
    System.out.println("create non-seat ticket");
    Ticket ticket = ticketFactory.createTicket(880, null);
    ticket.sell();

    System.out.println("create ticket with seat");
    ticket = ticketFactory.createTicket(1280, 666);
    ticket.sell();
  }

}
