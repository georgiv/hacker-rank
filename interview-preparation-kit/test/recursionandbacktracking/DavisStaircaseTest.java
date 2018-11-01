package recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

public class DavisStaircaseTest {
  @Test
  public void testStepPermsOneStep() {
    Assert.assertEquals(1, DavisStaircase.stepPerms(1));
  }

  @Test
  public void testStepPermsThreeSteps() {
    Assert.assertEquals(4, DavisStaircase.stepPerms(3));
  }

  @Test
  public void testStepPermsSevenSteps() {
    Assert.assertEquals(44, DavisStaircase.stepPerms(7));
  }
}
