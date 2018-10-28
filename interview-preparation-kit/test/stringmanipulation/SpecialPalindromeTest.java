package stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class SpecialPalindromeTest {
  @Test
  public void substrCountTest1() {
    Assert.assertTrue(SpecialPalindrome.substrCount(5, "asasd") == 7);
  }

  @Test
  public void substrCountTest2() {
    Assert.assertTrue(SpecialPalindrome.substrCount(7, "abcbaba") == 10);
  }

  @Test
  public void substrCountTest3() {
    Assert.assertTrue(SpecialPalindrome.substrCount(4, "aaaa") == 10);
  }
}
