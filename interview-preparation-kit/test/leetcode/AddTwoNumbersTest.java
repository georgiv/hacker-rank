package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
  @Test
  public void addTwoNumbersTest1() {
    ListNode headX = new ListNode(2);
    headX.next = new ListNode(4);
    headX.next.next = new ListNode(3);

    ListNode headY = new ListNode(5);
    headY.next = new ListNode(6);
    headY.next.next = new ListNode(4);

    ListNode expected = new ListNode(7);
    expected.next = new ListNode(0);
    expected.next.next = new ListNode(8);

    ListNode res = new AddTwoNumbers().addTwoNumbers(headX, headY);

    Assert.assertTrue(res != null);
    Assert.assertEquals(expected.val, res.val);

    Assert.assertTrue(res.next != null);
    Assert.assertEquals(expected.next.val, res.next.val);

    Assert.assertTrue(res.next.next != null);
    Assert.assertEquals(expected.next.next.val, res.next.next.val);

    Assert.assertTrue(res.next.next.next == null);
  }

  @Test
  public void addTwoNumbersTest2() {
    ListNode headX = new ListNode(0);
    ListNode headY = new ListNode(0);

    ListNode expected = new ListNode(0);

    ListNode res = new AddTwoNumbers().addTwoNumbers(headX, headY);

    Assert.assertTrue(res != null);
    Assert.assertEquals(expected.val, res.val);

    Assert.assertTrue(res.next == null);
  }

  @Test
  public void addTwoNumbersTest3() {
    ListNode headX = new ListNode(1);
    headX.next = new ListNode(8);
    ListNode headY = new ListNode(0);

    ListNode expected = new ListNode(1);
    expected.next = new ListNode(8);

    ListNode res = new AddTwoNumbers().addTwoNumbers(headX, headY);

    Assert.assertTrue(res != null);
    Assert.assertEquals(expected.val, res.val);

    Assert.assertTrue(res.next != null);
    Assert.assertEquals(expected.next.val, res.next.val);

    Assert.assertTrue(res.next.next == null);
  }

  @Test
  public void addTwoNumbersTest4() {
    ListNode headX = new ListNode(5);
    ListNode headY = new ListNode(5);

    ListNode expected = new ListNode(0);
    expected.next = new ListNode(1);

    ListNode res = new AddTwoNumbers().addTwoNumbers(headX, headY);

    Assert.assertTrue(res != null);
    Assert.assertEquals(expected.val, res.val);

    Assert.assertTrue(res.next != null);
    Assert.assertEquals(expected.next.val, res.next.val);

    Assert.assertTrue(res.next.next == null);
  }
}
