package stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTest {
  @Test
  public void alternatingCharactersTest1() {
    Assert.assertTrue(AlternatingCharacters.alternatingCharacters("AAAA") == 3);
  }

  @Test
  public void alternatingCharactersTest2() {
    Assert.assertTrue(AlternatingCharacters.alternatingCharacters("BBBBB") == 4);
  }

  @Test
  public void alternatingCharactersTest3() {
    Assert.assertTrue(AlternatingCharacters.alternatingCharacters("ABABABAB") == 0);
  }

  @Test
  public void alternatingCharactersTest4() {
    Assert.assertTrue(AlternatingCharacters.alternatingCharacters("BABABA") == 0);
  }

  @Test
  public void alternatingCharactersTest5() {
    Assert.assertTrue(AlternatingCharacters.alternatingCharacters("AAABBB") == 4);
  }
}
