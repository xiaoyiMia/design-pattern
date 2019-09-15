package io.mars.design_pattern.factory.abstract_factory;

import io.mars.design_pattern.modules.OutsideStage;
import io.mars.design_pattern.modules.Stage;
import io.mars.design_pattern.modules.Ticket;

import java.util.ArrayList;
import java.util.List;

public class MusicFestivalFactory implements  IConcertFactory{

  @Override
  public List<Ticket> createTickets(int ticketsNumber, int price) {
    List<Ticket> tickets = new ArrayList<>(ticketsNumber);
    for(int i=0; i< ticketsNumber; i++) {
      tickets.add(new Ticket(price));
    }
    return tickets;
  }

  @Override
  public Stage createStage() {
    return new OutsideStage();
  }

}
