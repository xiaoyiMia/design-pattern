package io.mars.design_pattern.modules;

public class Ticket {

  private int price;

  public Ticket(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void sell() {
    System.out.println("selling ticket with price: " + price);
  }

}
