package search;

import org.junit.Assert;
import org.junit.Test;

public class SwapNodesTest {
  @Test
  public void swapNodesTest1() {
    int[][] indexes = { { 2, 3 },
                        { -1, -1 },
                        { -1, -1 } };
    int[] queries = { 1, 1 };
    int[][] expected = { { 3, 1, 2 },
                         { 2, 1, 3 } };
    int[][] res = SwapNodes.swapNodes(indexes, queries);
    Assert.assertTrue(expected.length == res.length);
    for (int i = 0; i < res.length; i++) {
      Assert.assertArrayEquals(expected[i], res[i]);
    }
  }

  @Test
  public void swapNodesTest2() {
    int[][] indexes = { { 2, 3 },
                        { -1, 4 },
                        { -1, 5 },
                        { -1, -1 },
                        { -1, -1 } };
    int[] queries = { 2 };
    int[][] expected = { { 4, 2, 1, 5, 3 } };
    int[][] res = SwapNodes.swapNodes(indexes, queries);
    Assert.assertTrue(expected.length == res.length);
    for (int i = 0; i < res.length; i++) {
      Assert.assertArrayEquals(expected[i], res[i]);
    }
  }

  @Test
  public void swapNodesTest3() {
    int[][] indexes = { { 2, 3 },
                        { 4, -1 },
                        { 5, -1 },
                        { 6, -1 },
                        { 7, 8 },
                        { -1, 9 },
                        {-1, -1 },
                        { 10, 11 },
                        { -1, -1 },
                        { -1, -1 },
                        { -1, -1 }};
    int[] queries = { 2, 4 };
    int[][] expected = { { 2, 9, 6, 4, 1, 3, 7, 5, 11, 8, 10 },
                         { 2, 6, 9, 4, 1, 3, 7, 5, 10, 8, 11 }};
    int[][] res = SwapNodes.swapNodes(indexes, queries);
    Assert.assertTrue(expected.length == res.length);
    for (int i = 0; i < res.length; i++) {
      Assert.assertArrayEquals(expected[i], res[i]);
    }
  }
}
