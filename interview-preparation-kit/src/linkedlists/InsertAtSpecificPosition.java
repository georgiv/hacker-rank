package linkedlists;

import java.io.IOException;
import java.util.Scanner;

public class InsertAtSpecificPosition {
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
      System.out.println((String.valueOf(node.data)));

      node = node.next;

      if (node != null) {
        System.out.println(sep);
      }
    }
  }

  static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    if (head == null || position == 0) {
      SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
      newHead.next = head;
      return newHead;
    }

    SinglyLinkedListNode current = head;
    for (int i = 0; i < position; i++) {
      if (current.next == null) {
        current.next = new SinglyLinkedListNode(data);
        break;
      }
      if (i + 1 == position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = current.next;
        current.next = newNode;
        break;
      }
      current = current.next;
    }

    return head;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    SinglyLinkedList llist = new SinglyLinkedList();

    int llistCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < llistCount; i++) {
      int llistItem = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      llist.insertNode(llistItem);
    }

    int data = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int position = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

    printSinglyLinkedList(llist_head, " ");

    scanner.close();
  }
}
