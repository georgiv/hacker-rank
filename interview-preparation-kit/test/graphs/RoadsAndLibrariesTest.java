package graphs;

import org.junit.Assert;
import org.junit.Test;

public class RoadsAndLibrariesTest {
  @Test
  public void roadsAndLibrariesTest1() {
    int[][] cities = { { 1, 2 },
                       { 3, 1 },
                       { 2, 3 } };
    int n = 3;
    int c_lib = 2;
    int c_road = 1;

    Assert.assertEquals(4, RoadsAndLibraries.roadsAndLibraries(n, c_lib, c_road, cities));
  }

  @Test
  public void roadsAndLibrariesTest2() {
    int[][] cities = { { 1, 3 },
        { 3, 4 },
        { 2, 4 },
        { 1, 2 },
        { 2, 3 },
        { 5, 6 } };
    int n = 6;
    int c_lib = 2;
    int c_road = 5;

    Assert.assertEquals(12, RoadsAndLibraries.roadsAndLibraries(n, c_lib, c_road, cities));
  }

  @Test
  public void roadsAndLibrariesTest3() {
    int[][] cities = { { 8, 2 },
                       { 2, 9 } };
    int n = 9;
    int c_lib = 91;
    int c_road = 84;

    Assert.assertEquals(805, RoadsAndLibraries.roadsAndLibraries(n, c_lib, c_road, cities));
  }
}
