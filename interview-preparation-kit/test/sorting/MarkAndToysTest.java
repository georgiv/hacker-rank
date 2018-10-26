package sorting;

import org.junit.Assert;
import org.junit.Test;

public class MarkAndToysTest {
  @Test
  public void maximumToysTest1() {
    int[] prices = { 1, 2, 3, 4 };
    int k = 7;
    Assert.assertTrue(MarkAndToys.maximumToys(prices, k) == 3);
  }

  @Test
  public void maximumToysTest2() {
    int[] prices = { 3, 7, 2, 9, 4 };
    int k = 15;
    Assert.assertTrue(MarkAndToys.maximumToys(prices, k) == 3);
  }

  @Test
  public void maximumToysTest3() {
    int[] prices = { 1, 12, 5, 111, 200, 1000, 10 };
    int k = 50;
    Assert.assertTrue(MarkAndToys.maximumToys(prices, k) == 4);
  }

  @Test
  public void maximumToysTest4() {
    int[] prices = { 33324560,
        77661073,
        31948330,
        21522343,
        97176507,
        5724692,
        24699815,
        12079402,
        6479353,
        28430129,
        42427721,
        57127004,
        26256001,
        29446837,
        65107604,
        9809008,
        65846182,
        8470661,
        13597655,
        360 };
    int k = 100000;
    Assert.assertTrue(MarkAndToys.maximumToys(prices, k) == 1);
  }

  @Test
  public void maximumToysTest5() {
    int[] prices = { 52952808,
                     39586066,
                     70403274,
                     84627963,
                     46636834,
                     13906132,
                     18138605,
                     22451014,
                     71348257,
                     91939176,
                     17451226,
                     31356009,
                     15266983,
                     33392541,
                     37992362,
                     55743111,
                     55380991,
                     48022854,
                     54843595,
                     440 };
    int k = 100000;
    Assert.assertTrue(MarkAndToys.maximumToys(prices, k) == 1);
  }
}
