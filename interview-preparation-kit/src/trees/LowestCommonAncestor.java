package trees;

import static trees.Node.insert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LowestCommonAncestor {
  public static Node lca(Node root, int v1, int v2) {
    if (root == null) return null;

    Queue<Node> path = new ArrayDeque<>();
    path.offer(root);

    Node res = null;

    while (!path.isEmpty()) {
      Node current = path.poll();

      boolean v1Found = traverse(current, v1);
      boolean v2Found = traverse(current, v2);

      if (v1Found && v2Found) {
        res = current;
        if (current.left != null) {
          path.offer(current.left);
        }
        if (current.right != null) {
          path.offer(current.right);
        }
      }
    }

    return res;
  }

  private static boolean traverse(Node root ,int v) {
    if (root == null) return false;

    Deque<Node> path = new ArrayDeque<>();
    path.push(root);

    while (!path.isEmpty()) {
      Node current = path.pop();

      if (current.data == v) return true;

      if (current.left != null) {
        path.push(current.left);
      }
      if (current.right != null) {
        path.push(current.right);
      }
    }

    return false;
  }

  // Alternative approach with recursion which is taking advantage of the binary search tree properties
//  public static Node lca(Node root, int v1, int v2) {
//    if (root.data > v1 && root.data > v2) {
//      return lca(root.left, v1, v2);
//    } else if (root.data < v1 && root.data < v2) {
//      return lca(root.right, v1, v2);
//    }
//    return root;
//  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());

    Node root = null;

    String[] nodesLine = in.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      root = insert(root, Integer.parseInt(nodesLine[i]));
    }

    nodesLine = in.readLine().split(" ");
    int v1 = Integer.parseInt(nodesLine[0]);
    int v2 = Integer.parseInt(nodesLine[1]);

    System.out.println(lca(root, v1, v2));
  }
}
