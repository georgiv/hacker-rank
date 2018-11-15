package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
  @Test
  public void reverseTest1() {
    int x = 0;
    int expected = 0;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest2() {
    int x = 5;
    int expected = 5;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest3() {
    int x = -9;
    int expected = -9;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest4() {
    int x = 123;
    int expected = 321;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest5() {
    int x = -123;
    int expected = -321;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest6() {
    int x = 120;
    int expected = 21;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest7() {
    int x = Integer.MAX_VALUE;
    int expected = 0;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest8() {
    int x = Integer.MIN_VALUE;
    int expected = 0;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest9() {
    int x = Integer.MAX_VALUE - 1;
    int expected = 0;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }

  @Test
  public void reverseTest10() {
    int x = Integer.MIN_VALUE + 1;
    int expected = 0;
    Assert.assertEquals(expected, new ReverseInteger().reverse(x));
  }
}
