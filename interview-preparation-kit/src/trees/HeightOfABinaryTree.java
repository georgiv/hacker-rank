package trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Node {
  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

public class HeightOfABinaryTree {
  public static int height(Node root) {
    if (root == null || (root.left == null && root.right == null)) {
      return 0;
    }

    Deque<Node> path = new ArrayDeque<>();
    path.push(root);

    int res = 0;
    int currentRes = 0;

    while (!path.isEmpty()) {
      Node current = path.pop();

      if (current.left == null && current.right == null) {
        res = Math.max(currentRes, res);
        currentRes = 0;
      }

      if (current.left != null) {
        path.push(current.left);
      }
      if (current.right != null) {
        path.push(current.right);
      }

      currentRes++;
    }

    return res;
    //return traverse(root);
  }

  // Alternative solution with recursion
  private static int traverse(Node root) {
    if (root == null) {
      return -1;
    }

    return Math.max(1 + traverse(root.left), 1 + traverse(root.right));
  }

  public static Node insert(Node root, int data) {
    if(root == null) {
      return new Node(data);
    } else {
      Node cur;
      if(data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      } else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(in.readLine());

    Node root = null;

    String[] nodesLine = in.readLine().split(" ");
    for (int i = 0; i < t; i++) {
      root = insert(root, Integer.parseInt(nodesLine[i]));
    }

    System.out.println(height(root));
  }
}
