package linkedlists;

import java.io.IOException;
import java.util.Scanner;

public class InsertAtSortedList {
  static class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
      this.prev = null;
    }
  }

  static class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
      this.head = null;
      this.tail = null;
    }

    public void insertNode(int nodeData) {
      DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

      if (this.head == null) {
        this.head = node;
      } else {
        this.tail.next = node;
        node.prev = this.tail;
      }

      this.tail = node;
    }
  }

  public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
    while (node != null) {
      System.out.println(String.valueOf(node.data));

      node = node.next;

      if (node != null) {
        System.out.println(sep);
      }
    }
  }

  static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

    if (head == null) return newNode;

    if (newNode.data < head.data) {
      newNode.next = head;
      head.prev = newNode;
      return newNode;
    }

    DoublyLinkedListNode current = head;
    while (true) {
      if (newNode.data < current.data) {
        DoublyLinkedListNode previous = current.prev;
        newNode.prev = previous;
        previous.next = newNode;
        newNode.next = current;
        current.prev = newNode;
        break;
      }
      if (current.next == null) {
        current.next = newNode;
        newNode.prev = current;
        break;
      }
      current = current.next;
    }

    return head;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
      DoublyLinkedList llist = new DoublyLinkedList();

      int llistCount = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int i = 0; i < llistCount; i++) {
        int llistItem = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        llist.insertNode(llistItem);
      }

      int data = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

      printDoublyLinkedList(llist1, " ");
    }

    scanner.close();
  }
}
