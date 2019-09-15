package io.mars.design_pattern.modules;

public class TicketWithSeat extends Ticket {

  private int seatNumber;

  public TicketWithSeat(int price, int seatNumber) {
    super(price);
    this.seatNumber = seatNumber;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  public void sell() {
    System.out.println("selling ticket with price: " + super.getPrice() + "; Seat: " + this.seatNumber);
  }
}
