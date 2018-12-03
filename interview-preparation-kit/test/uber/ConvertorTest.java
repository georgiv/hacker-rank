package uber;

import org.junit.Assert;
import org.junit.Test;

public class ConvertorTest {
  @Test
  public void convertTest1() {
    String[] values = { "EUR-BGN-1.95583",
                        "USD-EUR-0.883",
                        "JPY-ISK-1.09",
                        "BGN-RON-15",
                        "USD-BGN-1.35",
                        "CHF-BGN-1.755" };

    ConversionGraph g = new ConversionGraph(values);

    String from = "CHF";
    String to = "RON";
    int units = 10;

    double expected = 5.11;
    Assert.assertEquals(expected, new Convertor().convert(g, from, to, units), 2);
  }
}
