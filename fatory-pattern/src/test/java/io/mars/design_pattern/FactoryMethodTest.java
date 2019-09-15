package io.mars.design_pattern;

import io.mars.design_pattern.factories.factory_method.IFactory;
import io.mars.design_pattern.factories.factory_method.TicketFactory;
import io.mars.design_pattern.factories.factory_method.TicketWithSeatFactory;
import io.mars.design_pattern.modules.Ticket;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

  @Test
  void factoryMethodTest() {
    IFactory ticketFactory = new TicketFactory();
    System.out.println("create non-seat ticket");
    Ticket ticket = ticketFactory.createTicket(880, null);
    ticket.sell();

    ticketFactory = new TicketWithSeatFactory();
    System.out.println("create ticket with seat");
    ticket = ticketFactory.createTicket(1280, 666);
    ticket.sell();
  }

}
