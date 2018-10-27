package stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class MakingAnagramsTest {
  @Test
  public void makeAnagramTest1() {
    String a = "cde";
    String b = "abc";
    Assert.assertTrue(MakingAnagrams.makeAnagram(a, b) == 4);
  }

  @Test
  public void makeAnagramTest2() {
    String a = "fcrxzwscanmligyxyvym";
    String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
    Assert.assertTrue(MakingAnagrams.makeAnagram(a, b) == 30);
  }

  @Test
  public void makeAnagramTest3() {
    String a = "bugexikjevtubidpulaelsbcqlupwetzyzdvjphn";
    String b = "lajoipfecfinxjspxmevqxuqyalhrsxcvgsdxxkacspbchrbvvwnvsdtsrdk";
    Assert.assertTrue(MakingAnagrams.makeAnagram(a, b) == 40);
  }

  @Test
  public void makeAnagramTest4() {
    String a = "fsqoiaidfaukvngpsugszsnseskicpejjvytviya";
    String b = "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget";
    Assert.assertTrue(MakingAnagrams.makeAnagram(a, b) == 42);
  }

  @Test
  public void makeAnagramTest5() {
    String a = "tttttttttttttttttttttttttttttttttttttsssssssssssssssss";
    String b = "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
    Assert.assertTrue(MakingAnagrams.makeAnagram(a, b) == 107);
  }

  @Test
  public void makeAnagramTest6() {
    String a = "showman";
    String b = "woman";
    Assert.assertTrue(MakingAnagrams.makeAnagram(a, b) == 2);
  }
}
