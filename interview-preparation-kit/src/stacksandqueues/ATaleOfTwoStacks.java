package stacksandqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class MyQueue<T> {
  private Stack<T> head = new Stack<>();
  private Stack<T> tail = new Stack<>();

  void enqueue(T item) {
    if (head.isEmpty()) {
      head.push(item);
    } else {
      tail.push(item);
    }
  }

  T dequeue() {
    T item = head.pop();
    if (head.isEmpty()) {
      while(!tail.isEmpty()) {
        head.push(tail.pop());
      }
    }
    return item;
  }

  T peek() {
    return head.peek();
  }
}

public class ATaleOfTwoStacks {
  public static void main(String[] args) throws IOException {
    MyQueue<Integer> queue = new MyQueue<Integer>();

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());

    for (int i = 0; i < n; i++) {
      String[] opLine = in.readLine().split(" ");
      int operation = Integer.parseInt(opLine[0]);
      if (operation == 1) {
        queue.enqueue(Integer.parseInt(opLine[1]));
      } else if (operation == 2) {
        queue.dequeue();
      } else if (operation == 3) {
        System.out.println(queue.peek());
      }
    }
  }
}
