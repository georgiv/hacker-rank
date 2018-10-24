package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

public class TwoStringsTest {
  @Test
  public void twoStringsTest1() {
    Assert.assertTrue(TwoStrings.twoStrings("hello", "world").equals("YES"));
  }

  @Test
  public void twoStringsTest2() {
    Assert.assertTrue(TwoStrings.twoStrings("hi", "world").equals("NO"));
  }
}
