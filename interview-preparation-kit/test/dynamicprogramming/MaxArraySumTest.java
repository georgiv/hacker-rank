package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class MaxArraySumTest {
  @Test
  public void maxSubsetSumTest1() {
    int[] arr = { 3, 7, 4, 6, 5 };
    Assert.assertEquals(13, MaxArraySum.maxSubsetSum(arr));
  }

  @Test
  public void maxSubsetSumTest2() {
    int[] arr = { 2, 1, 5, 8, 4 };
    Assert.assertEquals(11, MaxArraySum.maxSubsetSum(arr));
  }

  @Test
  public void maxSubsetSumTest3() {
    int[] arr = { 3, 5, -7, 8, 10 };
    Assert.assertEquals(15, MaxArraySum.maxSubsetSum(arr));
  }
}
