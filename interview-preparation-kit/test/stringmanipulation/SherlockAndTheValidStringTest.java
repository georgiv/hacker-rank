package stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SherlockAndTheValidStringTest {
  @Test
  public void isValidTest1() {
    String s = "aabbcd";
    Assert.assertTrue(SherlockAndTheValidString.isValid(s).equals("NO"));
  }

  @Test
  public void isValidTest2() {
    String s = "aabbccddeefghi";
    Assert.assertTrue(SherlockAndTheValidString.isValid(s).equals("NO"));
  }

  @Test
  public void isValidTest3() {
    String s = "abcdefghhgfedecba";
    Assert.assertTrue(SherlockAndTheValidString.isValid(s).equals("YES"));
  }

  @Test
  public void isValidTest4() {
    String s = "aabbc";
    Assert.assertTrue(SherlockAndTheValidString.isValid(s).equals("YES"));
  }
}
