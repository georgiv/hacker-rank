package trees;

import static trees.Node.insert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

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

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());

    Node root = null;

    String[] nodesLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      root = insert(root, Integer.parseInt(nodesLine[i]));
    }

    System.out.println(height(root));
  }
}
