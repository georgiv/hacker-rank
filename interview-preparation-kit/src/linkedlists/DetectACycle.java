package linkedlists;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

public class DetectACycle {
  boolean hasCycle(Node head) {
    if (head == null || head.next == null) return false;

    Node slowRunner = head;
    Node fastRunner = head.next.next;
    while (true) {
      if (slowRunner == fastRunner) return true;

      if (slowRunner.next == null || fastRunner.next == null || fastRunner.next.next == null) return false;

      slowRunner = slowRunner.next;
      fastRunner = fastRunner.next.next;
    }
  }
}
