package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class CastleOnTheGridTest {
  @Test
  public void minimumMovesTest1() {
    String[] grid = {"...",
                     ".X.",
                     "..."};
    Assert.assertEquals(2, CastleOnTheGrid.minimumMoves(grid, 0, 0, 1, 2));
  }

  @Test
  public void minimumMovesTest2() {
    String[] grid = {".X.",
                     ".X.",
                     "..."};
    Assert.assertEquals(3, CastleOnTheGrid.minimumMoves(grid, 0, 0, 0, 2));
  }
}
