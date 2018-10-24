package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

public class SherlockAndAnagramsTest {
  @Test
  public void sherlockAndAnagramsTest1() {
    Assert.assertTrue(SherlockAndAnagrams.sherlockAndAnagrams("abba") == 4);
  }

  @Test
  public void sherlockAndAnagramsTest2() {
    Assert.assertTrue(SherlockAndAnagrams.sherlockAndAnagrams("abcd") == 0);
  }

  @Test
  public void sherlockAndAnagramsTest3() {
    Assert.assertTrue(SherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq") == 3);
  }

  @Test
  public void sherlockAndAnagramsTest4() {
    Assert.assertTrue(SherlockAndAnagrams.sherlockAndAnagrams("kkkk") == 10);
  }

  @Test
  public void sherlockAndAnagramsTest5() {
    Assert.assertTrue(SherlockAndAnagrams.sherlockAndAnagrams("cdcd") == 5);
  }
}
