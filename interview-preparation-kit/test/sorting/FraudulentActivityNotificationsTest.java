package sorting;

import org.junit.Assert;
import org.junit.Test;

public class FraudulentActivityNotificationsTest {
  @Test
  public void activityNotificationsTest1() {
    int[] expenditure = { 2, 3, 4, 2, 3, 6, 8, 4, 5 };
    int d = 5;
    Assert.assertTrue(FraudulentActivityNotifications.activityNotifications(expenditure, d) == 2);
  }

  @Test
  public void activityNotificationsTest2() {
    int[] expenditure = { 1, 2, 3, 4, 4 };
    int d = 4;
    Assert.assertTrue(FraudulentActivityNotifications.activityNotifications(expenditure, d) == 0);
  }
}
