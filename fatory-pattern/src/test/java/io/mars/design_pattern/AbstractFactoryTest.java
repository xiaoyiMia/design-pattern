package io.mars.design_pattern;

import io.mars.design_pattern.factory.abstract_factory.IConcertFactory;
import io.mars.design_pattern.factory.abstract_factory.IndoorConcertFactory;
import io.mars.design_pattern.factory.abstract_factory.MusicFestivalFactory;
import io.mars.design_pattern.modules.Stage;
import io.mars.design_pattern.modules.Ticket;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AbstractFactoryTest {

  @Test
  void abstractFactoryTest() {
    IConcertFactory factory = new MusicFestivalFactory();
    List<Ticket> tickets = factory.createTickets(20000, 500);
    Stage stage = factory.createStage();
    System.out.println("Music Festival");
    printInfo(stage, tickets);
    tickets.get(0).sell();



    factory = new IndoorConcertFactory();
    tickets = factory.createTickets(60000, 580);
    stage = factory.createStage();
    System.out.println("Indoor Concert");
    printInfo(stage, tickets);
    tickets.get(0).sell();
  }

  private void printInfo(Stage stage, List<Ticket> tickets) {
    System.out.println("Stage: " + stage.getStageType());
    System.out.println(tickets.size() + " tickets");
  }
}
