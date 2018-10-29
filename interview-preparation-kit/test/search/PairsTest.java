package search;

import org.junit.Assert;
import org.junit.Test;

public class PairsTest {
  @Test
  public void pairsTest1() {
    Assert.assertEquals(3, Pairs.pairs(2, new int[]{ 1, 5, 3, 4, 2 }));
  }
}
