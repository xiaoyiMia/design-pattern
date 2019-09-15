package io.mars.design_pattern.factories.factory_method;

import io.mars.design_pattern.modules.Ticket;
import io.mars.design_pattern.modules.TicketWithSeat;

public class TicketWithSeatFactory implements IFactory {

  @Override
  public Ticket createTicket(int price, Integer seatNumber) {
    if(seatNumber == null) {
      throw new IllegalArgumentException("seat number must be given with a int number");
    }
    return new TicketWithSeat(price, seatNumber);
  }

}
