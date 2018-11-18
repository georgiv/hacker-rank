package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
  @Test
  public void isPalindromeTest1() {
    Assert.assertTrue(new PalindromeNumber().isPalindrome(121));
  }

  @Test
  public void isPalindromeTest2() {
    Assert.assertFalse(new PalindromeNumber().isPalindrome(-121));
  }

  @Test
  public void isPalindromeTest3() {
    Assert.assertFalse(new PalindromeNumber().isPalindrome(10));
  }
}
