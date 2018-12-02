package uber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ConversionValue {
  private String currency;
  private double rate;

  public ConversionValue(String currency, double rate) {
    this.currency = currency;
    this.rate = rate;
  }

  public String getCurrency() {
    return currency;
  }

  public double getRate() {
    return rate;
  }
}

class ConversionGraph {
  private int vertices;
  private Map<String, List<ConversionValue>> adjacent;

  public ConversionGraph(String[] values) {
    this.adjacent = new HashMap<>();
    init(values);
  }

  private void init(String[] values) {
    for (int i = 0; i < values.length; i++) {
      String[] valueElements = values[i].split("-");
      String from = valueElements[0];
      String to = valueElements[1];
      double rate = Double.parseDouble(valueElements[2]);
      double reversedRate = 1 / rate;

      connect(from, new ConversionValue(to, rate));
      connect(to, new ConversionValue(from, reversedRate));
    }
  }

  public void connect(String from, ConversionValue to) {
    if (!adjacent.containsKey(from)) adjacent.put(from, new ArrayList<>());

    adjacent.get(from).add(to);
  }

  public int getVertices() {
    return vertices;
  }

  public Map<String, List<ConversionValue>> getAdjacent() {
    return adjacent;
  }
}

public class Convertor {
  public double convert(ConversionGraph g, String from, String to, int units) {
    return 0.0;
  }
}
