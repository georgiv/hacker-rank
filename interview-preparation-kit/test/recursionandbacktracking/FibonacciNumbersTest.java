package recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumbersTest {
  @Test
  public void testFibonacciZero() {
    Assert.assertEquals(0, FibonacciNumbers.fibonacci(0));
  }

  @Test
  public void testFibonacciOne() {
    Assert.assertEquals(1, FibonacciNumbers.fibonacci(1));
  }

  @Test
  public void testFibonacciFive() {
    Assert.assertEquals(5, FibonacciNumbers.fibonacci(5));
  }
}
