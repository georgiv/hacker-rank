package recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveDigitSumTest {
  @Test
  public void testSuperDigitZeroWithoutRepetition() {
    String n = "0";
    Assert.assertEquals(0, RecursiveDigitSum.superDigit(n, 1));
  }

  @Test
  public void testSuperDigitZeroWithRepetition() {
    String n = "0";
    Assert.assertEquals(0, RecursiveDigitSum.superDigit(n, 4));
  }

  @Test
  public void testSuperDigitFiveWithoutRepetition() {
    String n = "5";
    Assert.assertEquals(5, RecursiveDigitSum.superDigit(n, 1));
  }

  @Test
  public void testSuperDigitFiveWithRepetition() {
    String n = "5";
    Assert.assertEquals(2, RecursiveDigitSum.superDigit(n, 4));
  }

  @Test
  public void testSuperDigit9875WithoutRepetition() {
    String n = "9875";
    Assert.assertEquals(2, RecursiveDigitSum.superDigit(n, 1));
  }

  @Test
  public void testSuperDigit9875WithRepetition() {
    String n = "9875";
    Assert.assertEquals(8, RecursiveDigitSum.superDigit(n, 4));
  }
}
