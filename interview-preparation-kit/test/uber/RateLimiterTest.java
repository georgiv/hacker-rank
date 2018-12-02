package uber;

import org.junit.Assert;
import org.junit.Test;

public class RateLimiterTest {
  @Test
  public void limitTest1() {
    RateLimiter rl = new RateLimiter(5, 1000);
    String ip = "0.0.0.0";
    Assert.assertTrue(rl.limit(ip, System.currentTimeMillis()));
    Assert.assertTrue(rl.limit(ip, System.currentTimeMillis()));
    Assert.assertTrue(rl.limit(ip, System.currentTimeMillis()));
    Assert.assertTrue(rl.limit(ip, System.currentTimeMillis()));
    Assert.assertTrue(rl.limit(ip, System.currentTimeMillis()));
    Assert.assertFalse(rl.limit(ip, System.currentTimeMillis()));
    Assert.assertTrue(rl.limit(ip, System.currentTimeMillis() + 2000));
    Assert.assertTrue(rl.limit(ip, System.currentTimeMillis() + 2000));
  }
}
