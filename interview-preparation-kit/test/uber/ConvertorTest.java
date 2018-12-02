package uber;

import org.junit.Test;

public class ConvertorTest {
  @Test
  public void convertTest1() {
    String[] values = { "EUR-BGN-1.95583",
                        "USD-EUR-0.883",
                        "JPY-ISK-1.09" };

    ConversionGraph g = new ConversionGraph(values);

    
  }
}
