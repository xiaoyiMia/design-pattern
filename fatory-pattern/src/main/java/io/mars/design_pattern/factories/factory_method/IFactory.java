package io.mars.design_pattern.factories.factory_method;

import io.mars.design_pattern.modules.Ticket;

public interface IFactory {

  Ticket createTicket(int price, Integer seatNumber);

}
