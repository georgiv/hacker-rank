package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwaps2Test {
  @Test
  public void minimumSwapsTest1() {
    int[] arr = {2, 3, 4, 1, 5};
    Assert.assertTrue(MinimumSwaps2.minimumSwaps(arr) == 3);
  }
}
