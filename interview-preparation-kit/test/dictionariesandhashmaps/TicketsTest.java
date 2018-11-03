package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

public class TicketsTest {
  @Test
  public void routeTestNull() {
    Ticket[] tickets = null;
    String expected = "";
    Assert.assertEquals(expected, Tickets.route(tickets));
  }

  @Test
  public void routeTestNoTickets() {
    Ticket[] tickets = new Ticket[0];
    String expected = "";
    Assert.assertEquals(expected, Tickets.route(tickets));
  }

  @Test
  public void routeTestOneTicket() {
    Ticket[] tickets = { new Ticket("Sofia", "London") };
    String expected = "Sofia-London";
    Assert.assertEquals(expected, Tickets.route(tickets));
  }

  @Test
  public void routeTestMultipleTickets1() {
    Ticket[] tickets = { new Ticket("Bangkok", "Tokyo"),
                         new Ticket("London", "Dubai"),
                         new Ticket("Sofia", "London"),
                         new Ticket("Dubai", "Bangkok") };
    String expected = "Sofia-London-Dubai-Bangkok-Tokyo";
    Assert.assertEquals(expected, Tickets.route(tickets));
  }

  @Test
  public void routeTestMultipleTickets2() {
    Ticket[] tickets = { new Ticket("Ontario", "New York"),
                         new Ticket("New York", "Los Angeles"),
                         new Ticket("Sofia", "Berlin"),
                         new Ticket("Los Angeles", "Mexico"),
                         new Ticket("Berlin", "Ontario") };
    String expected = "Sofia-Berlin-Ontario-New York-Los Angeles-Mexico";
    Assert.assertEquals(expected, Tickets.route(tickets));
  }
}
