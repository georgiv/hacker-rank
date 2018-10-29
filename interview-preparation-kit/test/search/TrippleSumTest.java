package search;

import org.junit.Assert;
import org.junit.Test;

public class TrippleSumTest {
  @Test
  public void tripletsTest1() {
    int[] a = { 1, 3, 5 };
    int[] b = { 2, 3 };
    int[] c = { 1, 2, 3 };
    Assert.assertEquals(8, TrippleSum.triplets(a, b, c));
  }

  @Test
  public void tripletsTest2() {
    int[] a = { 1, 4, 5 };
    int[] b = { 2, 3, 3 };
    int[] c = { 1, 2, 3 };
    Assert.assertEquals(5, TrippleSum.triplets(a, b, c));
  }

  @Test
  public void tripletsTest3() {
    int[] a = { 1, 3, 5, 7 };
    int[] b = { 5, 7, 9 };
    int[] c = { 7, 9, 11, 13 };
    Assert.assertEquals(12, TrippleSum.triplets(a, b, c));
  }
}
