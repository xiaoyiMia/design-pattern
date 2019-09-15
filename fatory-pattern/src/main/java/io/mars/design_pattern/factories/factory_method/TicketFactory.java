package io.mars.design_pattern.factories.factory_method;

import io.mars.design_pattern.modules.Ticket;

public class TicketFactory implements IFactory {

  @Override
  public Ticket createTicket(int price, Integer seatNumber) {
    return new Ticket(price);
  }

}
