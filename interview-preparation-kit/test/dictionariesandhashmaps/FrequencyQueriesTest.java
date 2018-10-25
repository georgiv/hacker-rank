package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyQueriesTest {
  @Test
  public void freqQueryTest1() {
    List<int[]> ops = new ArrayList<>();
    ops.add(new int[] { 1, 5 });
    ops.add(new int[] { 1, 6 });
    ops.add(new int[] { 3, 2 });
    ops.add(new int[] { 1, 10 });
    ops.add(new int[] { 1, 10 });
    ops.add(new int[] { 1, 6 });
    ops.add(new int[] { 2, 5 });
    ops.add(new int[] { 3, 2 });
    Assert.assertTrue(FrequencyQueries.freqQuery(ops).equals(Arrays.asList(0, 1)));
  }

  @Test
  public void freqQueryTest2() {
    List<int[]> ops = new ArrayList<>();
    ops.add(new int[] { 3, 4 });
    ops.add(new int[] { 2, 1003 });
    ops.add(new int[] { 1, 16 });
    ops.add(new int[] { 3, 1 });
    Assert.assertTrue(FrequencyQueries.freqQuery(ops).equals(Arrays.asList(0, 1)));
  }

  @Test
  public void freqQueryTest3() {
    List<int[]> ops = new ArrayList<>();
    ops.add(new int[] { 1, 3 });
    ops.add(new int[] { 2, 3 });
    ops.add(new int[] { 3, 2 });
    ops.add(new int[] { 1, 4 });
    ops.add(new int[] { 1, 5 });
    ops.add(new int[] { 1, 5 });
    ops.add(new int[] { 1, 4 });
    ops.add(new int[] { 3, 2 });
    ops.add(new int[] { 2, 4 });
    ops.add(new int[] { 3, 2 });
    Assert.assertTrue(FrequencyQueries.freqQuery(ops).equals(Arrays.asList(0, 1, 1)));
  }
}
