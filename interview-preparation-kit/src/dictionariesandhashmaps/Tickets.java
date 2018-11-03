package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Ticket {
  private String from;
  private String to;

  Ticket(String from, String to) {
    this.from = from;
    this.to = to;
  }

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }
}

public class Tickets {
  static String route(Ticket[] pile) {
    if (pile == null || pile.length == 0) return "";

    if (pile.length == 1) return pile[0].getFrom() + "-" + pile[0].getTo();

    Map<String, String> fromTo = new HashMap<>();
    Map<String, String> toFrom = new HashMap<>();

    for (int i = 0; i < pile.length; i++) {
      fromTo.put(pile[i].getFrom(), pile[i].getTo());
      toFrom.put(pile[i].getTo(), pile[i].getFrom());
    }

    String start = null;

    for (String city : fromTo.keySet()) {
      if (!toFrom.containsKey(city)) {
        start = city;
        break;
      }
    }

    String end = null;

    for (String city : toFrom.keySet()) {
      if (!fromTo.containsKey(city)) {
        end = city;
        break;
      }
    }

    String res = start + "-";

    String current = start;
    while (true) {
      String next = fromTo.get(current);
      res += next;

      if (next.equals(end)) break;

      res += "-";
      current = next;
    }

    return res;
  }

  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());

    Ticket[] pile = new Ticket[n];
    for (int i = 0; i < n; i++) {
      String[] current = in.readLine().split(" ");
      pile[i] = new Ticket(current[0], current[1]);
    }

    System.out.println(route(pile));
  }
}
