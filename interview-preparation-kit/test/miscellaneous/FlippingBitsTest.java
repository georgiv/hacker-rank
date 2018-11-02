package miscellaneous;

import org.junit.Assert;
import org.junit.Test;

public class FlippingBitsTest {
  @Test
  public void flippingBitsTest1() {
    Assert.assertEquals(2147483648L, FlippingBits.flippingBits(2147483647));
  }

  @Test
  public void flippingBitsTest2() {
    Assert.assertEquals(4294967294L, FlippingBits.flippingBits(1));
  }

  @Test
  public void flippingBitsTest3() {
    Assert.assertEquals(4294967295L, FlippingBits.flippingBits(0));
  }

  @Test
  public void flippingBitsTest4() {
    Assert.assertEquals(4294967291L, FlippingBits.flippingBits(4));
  }

  @Test
  public void flippingBitsTest5() {
    Assert.assertEquals(4294843839L, FlippingBits.flippingBits(123456));
  }

  @Test
  public void flippingBitsTest6() {
    Assert.assertEquals(3492223820L, FlippingBits.flippingBits(802743475));
  }

  @Test
  public void flippingBitsTest7() {
    Assert.assertEquals(4259365872L, FlippingBits.flippingBits(35601423));
  }
}
