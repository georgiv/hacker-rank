package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CheckerTest {
  @Test
  public void compareTest1() throws Exception {
    Player[] players = { new Player("amy", 100),
                         new Player("david", 100),
                         new Player("heraldo", 50),
                         new Player("aakansha", 75),
                         new Player("aleksa", 150) };

    Player[] sorted = { new Player("aleksa", 150),
                        new Player("amy", 100),
                        new Player("david", 100),
                        new Player("aakansha", 75),
                        new Player("heraldo", 50) };

    Arrays.sort(players, new Checker());

    for (int i = 0; i < players.length; i++) {
      Assert.assertTrue(players[i].name.equals(sorted[i].name));
      Assert.assertTrue(players[i].score == sorted[i].score);
    }
  }
}
