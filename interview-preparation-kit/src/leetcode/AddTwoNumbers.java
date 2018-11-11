package leetcode;

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null;
    ListNode res = null;

    int carry = 0;

    while (l1 != null || l2 != null) {
      int x = 0;
      int y = 0;

      if (l1 != null) {
        x = l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        y = l2.val;
        l2 = l2.next;
      }

      int digit = x + y + carry;
      carry = 0;

      if (digit >= 10) {
        carry = digit / 10;
        digit = digit % 10;
      }

      if (head == null) {
        head = new ListNode(digit);
        res = head;
      } else {
        res.next = new ListNode(digit);
        res = res.next;
      }
    }

    if (carry != 0) res.next = new ListNode(carry);

    return head;
  }
}
