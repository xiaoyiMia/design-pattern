package io.mars.design_pattern.factories.abstract_factory;

import io.mars.design_pattern.modules.Stage;
import io.mars.design_pattern.modules.Ticket;

import java.util.List;

public interface IConcertFactory {

  List<Ticket> createTickets(int ticketsNumber, int price);

  Stage createStage();

}
