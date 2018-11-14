package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {
  @Test
  public void convertTest1() {
    String s = "PAYPALISHIRING";
    int rows = 3;
    String expected = "PAHNAPLSIIGYIR";
    Assert.assertEquals(expected, new ZigZagConversion().convert(s, rows));
  }

  @Test
  public void convertTest2() {
    String s = "PAYPALISHIRING";
    int rows = 4;
    String expected = "PINALSIGYAHRPI";
    Assert.assertEquals(expected, new ZigZagConversion().convert(s, rows));
  }

  @Test
  public void convertTest3() {
    String s = "AB";
    int rows = 1;
    String expected = "AB";
    Assert.assertEquals(expected, new ZigZagConversion().convert(s, rows));
  }
}
