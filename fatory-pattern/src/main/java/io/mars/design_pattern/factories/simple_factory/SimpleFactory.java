package io.mars.design_pattern.factories.simple_factory;

import io.mars.design_pattern.modules.Ticket;
import io.mars.design_pattern.modules.TicketWithSeat;

public class SimpleFactory {

  public Ticket createTicket(int price, Integer seatNumber) {
    if(seatNumber == null) return new Ticket(price);
    else return new TicketWithSeat(price, seatNumber);
  }

}
