package search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamParlorTest {
  @Test
  public void whatFlavorsTest1() {
    int[] cost = { 1, 4, 5, 3, 2 };
    int money = 4;
    Assert.assertTrue(IceCreamParlor.whatFlavors(cost, money).equals("1 4"));
  }

  @Test
  public void whatFlavorsTest2() {
    int[] cost = { 2, 2, 4, 3 };
    int money = 4;
    Assert.assertTrue(IceCreamParlor.whatFlavors(cost, money).equals("1 2"));
  }
}
