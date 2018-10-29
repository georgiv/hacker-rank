package search;

import org.junit.Assert;
import org.junit.Test;

public class MinimumTimeRequiredTest {
  @Test
  public void minTimeTest1() {
    long[] machines = { 2, 3 };
    long goal = 5;
    Assert.assertEquals(6, MinimumTimeRequired.minTime(machines, goal));
  }

  @Test
  public void minTimeTest2() {
    long[] machines = { 1, 3, 4 };
    long goal = 10;
    Assert.assertEquals(7, MinimumTimeRequired.minTime(machines, goal));
  }

  @Test
  public void minTimeTest3() {
    long[] machines = { 4, 5, 6 };
    long goal = 12;
    Assert.assertEquals(20, MinimumTimeRequired.minTime(machines, goal));
  }
}
