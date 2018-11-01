package linkedlists;

import org.junit.Assert;
import org.junit.Test;

public class DetectACycleTest {
  @Test
  public void hasCycleTest1() {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = head.next.next;

    Assert.assertTrue(new DetectACycle().hasCycle(head));
  }

  @Test
  public void hasCycleTest2() {
    Node head = new Node(1);

    Assert.assertFalse(new DetectACycle().hasCycle(head));
  }

  @Test
  public void hasCycleTest3() {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head.next;

    Assert.assertTrue(new DetectACycle().hasCycle(head));
  }

  @Test
  public void hasCycleTest4() {
    Assert.assertFalse(new DetectACycle().hasCycle(null));
  }
}
