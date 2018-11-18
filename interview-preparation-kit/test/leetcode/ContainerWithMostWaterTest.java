package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {
  @Test
  public void maxAreaTest1() {
    int[] heigth = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int expected = 49;
    Assert.assertEquals(expected, new ContainerWithMostWater().maxArea(heigth));
  }

  @Test
  public void maxAreaTest2() {
    int[] heigth = { 2, 3, 4, 5, 18, 17 ,6 };
    int expected = 17;
    Assert.assertEquals(expected, new ContainerWithMostWater().maxArea(heigth));
  }
}
