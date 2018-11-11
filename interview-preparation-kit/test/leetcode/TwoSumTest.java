package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
  @Test
  public void twoSumTest1() {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    int[] expected = { 0, 1 };
    Assert.assertArrayEquals(expected, new TwoSum().twoSum(nums, target));
  }

  @Test
  public void twoSumTest2() {
    int[] nums = { 3, 2, 4 };
    int target = 6;
    int[] expected = { 1, 2 };
    Assert.assertArrayEquals(expected, new TwoSum().twoSum(nums, target));
  }
}
