package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class BalancedBracketsTest {
  @Test
  public void isBalancedTest1() {
    Assert.assertEquals("YES", BalancedBrackets.isBalanced("{[()]}"));
  }

  @Test
  public void isBalancedTest2() {
    Assert.assertEquals("NO", BalancedBrackets.isBalanced("{[(])}"));
  }

  @Test
  public void isBalancedTest3() {
    Assert.assertEquals("YES", BalancedBrackets.isBalanced("{{[[(())]]}}"));
  }
}
