package linkedlists;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMergePoint {
  static class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }

  static class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
      this.head = null;
      this.tail = null;
    }

    public void insertNode(int nodeData) {
      SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

      if (this.head == null) {
        this.head = node;
      } else {
        this.tail.next = node;
      }

      this.tail = node;
    }
  }

  public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
    while (node != null) {
      System.out.println(String.valueOf(node.data));

      node = node.next;

      if (node != null) {
        System.out.println(sep);
      }
    }
  }

  static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    Map<SinglyLinkedListNode, Integer> nodeToData = new HashMap<>();

    SinglyLinkedListNode current = head1;
    while (current != null) {
      nodeToData.put(current, current.data);
      current = current.next;
    }

    current = head2;
    while (true) {
      if (nodeToData.containsKey(current)) {
        return nodeToData.get(current);
      }
      current = current.next;
    }
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int tests = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int testsItr = 0; testsItr < tests; testsItr++) {
      int index = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      SinglyLinkedList llist1 = new SinglyLinkedList();

      int llist1Count = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < llist1Count; i++) {
        int llist1Item = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        llist1.insertNode(llist1Item);
      }

      SinglyLinkedList llist2 = new SinglyLinkedList();

      int llist2Count = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < llist2Count; i++) {
        int llist2Item = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        llist2.insertNode(llist2Item);
      }

      SinglyLinkedListNode ptr1 = llist1.head;
      SinglyLinkedListNode ptr2 = llist2.head;

      for (int i = 0; i < llist1Count; i++) {
        if (i < index) {
          ptr1 = ptr1.next;
        }
      }

      for (int i = 0; i < llist2Count; i++) {
        if (i != llist2Count-1) {
          ptr2 = ptr2.next;
        }
      }

      ptr2.next = ptr1;

      System.out.println(findMergeNode(llist1.head, llist2.head));
    }

    scanner.close();
  }
}
