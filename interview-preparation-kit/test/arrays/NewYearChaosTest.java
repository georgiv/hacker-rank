package arrays;

import org.junit.Assert;
import org.junit.Test;

public class NewYearChaosTest {
  @Test
  public void minimumBribesTest1() {
    int[] q = { 2, 1, 5, 3, 4 };
    Assert.assertTrue(NewYearChaos.minimumBribes(q) == 3);
  }

  @Test
  public void minimumBribesTest2() {
    int[] q = { 2, 5, 1, 3, 4 };
    Assert.assertTrue(NewYearChaos.minimumBribes(q) == -1);
  }

  @Test
  public void minimumBribesTest3() {
    int[] q = { 5, 1, 2, 3, 7, 8, 6, 4 };
    Assert.assertTrue(NewYearChaos.minimumBribes(q) == -1);
  }

  @Test
  public void minimumBribesTest4() {
    int[] q = { 1, 2, 5, 3, 7, 8, 6, 4 };
    Assert.assertTrue(NewYearChaos.minimumBribes(q) == 7);
  }
}
