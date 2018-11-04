package graphs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectedCellTest {
  @Test
  public void maxRegionTest1() {
    int[][] grid = null;
    Assert.assertEquals(0, ConnectedCell.maxRegion(grid));
  }

  @Test
  public void maxRegionTest2() {
    int[][] grid = new int[0][0];
    Assert.assertEquals(0, ConnectedCell.maxRegion(grid));
  }

  @Test
  public void maxRegionTest3() {
    int[][] grid = new int[1][1];
    Assert.assertEquals(0, ConnectedCell.maxRegion(grid));
  }

  @Test
  public void maxRegionTest4() {
    int[][] grid = { { 1 } };
    Assert.assertEquals(1, ConnectedCell.maxRegion(grid));
  }

  @Test
  public void maxRegionTest5() {
    int[][] grid = { { 1, 1, 0, 0 },
                     { 0, 1, 1, 0 },
                     { 0, 0, 1, 0 },
                     { 1, 0, 0, 0 } };
    Assert.assertEquals(5, ConnectedCell.maxRegion(grid));
  }

  @Test
  public void maxRegionTest6() {
    int[][] grid = { { 0, 0, 1, 1 },
                     { 0, 0, 1, 0 },
                     { 0, 1, 1, 0 },
                     { 0, 1, 0, 0 },
                     { 1, 1, 0, 0 } };
    Assert.assertEquals(8, ConnectedCell.maxRegion(grid));
  }
}
