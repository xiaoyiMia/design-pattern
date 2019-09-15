package io.mars.design_pattern.factory.abstract_factory;

import io.mars.design_pattern.modules.IndoorStage;
import io.mars.design_pattern.modules.Stage;
import io.mars.design_pattern.modules.Ticket;
import io.mars.design_pattern.modules.TicketWithSeat;

import java.util.ArrayList;
import java.util.List;

public class IndoorConcertFactory implements IConcertFactory {
  @Override
  public List<Ticket> createTickets(int ticketsNumber, int price) {
    List<Ticket> tickets = new ArrayList<>(ticketsNumber);
    for(int i=0; i< ticketsNumber; i++) {
      tickets.add(new TicketWithSeat(price, i));
    }
    return tickets;
  }

  @Override
  public Stage createStage() {
    return new IndoorStage();
  }
}
