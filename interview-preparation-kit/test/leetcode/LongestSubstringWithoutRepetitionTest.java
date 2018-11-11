package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepetitionTest {
  @Test
  public void lengthOfLongestSubstringTest1() {
    String s = "abcabcbb";
    Assert.assertEquals(3, new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(s));
  }

  @Test
  public void lengthOfLongestSubstringTest2() {
    String s = "bbbbb";
    Assert.assertEquals(1, new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(s));
  }

  @Test
  public void lengthOfLongestSubstringTest3() {
    String s = "pwwkew";
    Assert.assertEquals(3, new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(s));
  }

  @Test
  public void lengthOfLongestSubstringTest4() {
    String s = " ";
    Assert.assertEquals(1, new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(s));
  }

  @Test
  public void lengthOfLongestSubstringTest5() {
    String s = "dvdf";
    Assert.assertEquals(3, new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(s));
  }

  @Test
  public void lengthOfLongestSubstringTest6() {
    String s = "cdd";
    Assert.assertEquals(2, new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(s));
  }

  @Test
  public void lengthOfLongestSubstringTest7() {
    String s = "abba";
    Assert.assertEquals(2, new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(s));
  }
}
