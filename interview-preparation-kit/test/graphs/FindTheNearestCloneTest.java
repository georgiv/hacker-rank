package graphs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheNearestCloneTest {
  @Test
  public void findShortestTest1() {
    int n = 4;
    int[] from = { 1, 1, 4 };
    int[] to = { 2, 3, 2 };
    long[] colours = { 1, 2, 1, 1 };

    Assert.assertEquals(1, FindTheNearestClone.findShortest(n, from, to, colours, 1));
  }

  @Test
  public void findShortestTest2() {
    int n = 4;
    int[] from = { 1, 1, 4 };
    int[] to = { 2, 3, 2 };
    long[] colours = { 1, 2, 3, 4 };

    Assert.assertEquals(-1, FindTheNearestClone.findShortest(n, from, to, colours, 2));
  }

  @Test
  public void findShortestTest3() {
    int n = 5;
    int[] from = { 1, 1, 2, 3 };
    int[] to = { 2, 3, 4, 5 };
    long[] colours = { 1, 2, 3, 3, 2 };

    Assert.assertEquals(3, FindTheNearestClone.findShortest(n, from, to, colours, 2));
  }
}
