package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwaps2Test {
  @Test
  public void minimumSwapsTest1() {
    int[] arr = { 4, 3, 1, 2 };
    Assert.assertTrue(MinimumSwaps2.minimumSwaps(arr) == 3);
  }

  @Test
  public void minimumSwapsTest2() {
    int[] arr = { 2, 3, 4, 1, 5 };
    Assert.assertTrue(MinimumSwaps2.minimumSwaps(arr) == 3);
  }

  @Test
  public void minimumSwapsTest3() {
    int[] arr = { 1, 3, 5, 2, 4, 6, 7 };
    Assert.assertTrue(MinimumSwaps2.minimumSwaps(arr) == 3);
  }

  @Test
  public void minimumSwapsTest4() {
    int[] arr = { 7, 1, 3, 2, 4, 5, 6 };
    Assert.assertTrue(MinimumSwaps2.minimumSwaps(arr) == 5);
  }
}
