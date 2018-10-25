package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTripletsTest {
  @Test
  public void countTripletsTest1() {
    List<Long> arr = new ArrayList<Long>(Arrays.asList((long) 1,
                                                       (long) 2,
                                                       (long) 2,
                                                       (long) 4));
    Assert.assertTrue(CountTriplets.countTriplets(arr, 2) == 2);
  }

  @Test
  public void countTripletsTest2() {
    List<Long> arr = new ArrayList<Long>(Arrays.asList((long) 1,
                                                       (long) 3,
                                                       (long) 9,
                                                       (long) 9,
                                                       (long) 27,
                                                       (long) 81));
    Assert.assertTrue(CountTriplets.countTriplets(arr, 3) == 6);
  }

  @Test
  public void countTripletsTest3() {
    List<Long> arr = new ArrayList<Long>(Arrays.asList((long) 1,
                                                       (long) 5,
                                                       (long) 5,
                                                       (long) 25,
                                                       (long) 125));
    Assert.assertTrue(CountTriplets.countTriplets(arr, 5) == 4);
  }

  @Test
  public void countTripletsTest4() {
    List<Long> arr = new ArrayList<Long>(Arrays.asList((long) 1,
                                                    (long) 1,
                                                    (long) 1,
                                                    (long) 1));
    Assert.assertTrue(CountTriplets.countTriplets(arr, 1) == 4);
  }

  @Test
  public void countTripletsTest5() {
    List<Long> arr = new ArrayList<Long>(Arrays.asList((long) 1,
                                                    (long) 2,
                                                    (long) 1,
                                                    (long) 2,
                                                    (long) 4));
    Assert.assertTrue(CountTriplets.countTriplets(arr, 2) == 3);
  }
}
