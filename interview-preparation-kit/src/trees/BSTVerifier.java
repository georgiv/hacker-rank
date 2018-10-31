package trees;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BSTVerifier {
  boolean checkBST(Node root) {
    if (root == null) return false;

    if (root.left == null && root.right == null) return true;

    Set<Integer> uniques = new HashSet<>();
    uniques.add(root.data);

    int leftMax = Integer.MIN_VALUE;

    if (root.left != null) {
      Queue<Node> path = new ArrayDeque<>();
      path.offer(root.left);

      while(!path.isEmpty()) {
        Node current = path.poll();

        if (uniques.contains(current.data)) {
          return false;
        }
        uniques.add(current.data);

        if (current.data < leftMax) {
          leftMax = current.data;
        }

        if (current.left != null) {
          path.offer(current.left);
        }
        if (current.right != null) {
          path.offer(current.right);
        }
      }
    }

    int rightMax = Integer.MAX_VALUE;

    if (root.right != null) {
      Queue<Node> path = new ArrayDeque<>();
      path.offer(root.right);

      while(!path.isEmpty()) {
        Node current = path.poll();

        if (uniques.contains(current.data)) {
          return false;
        }
        uniques.add(current.data);

        if (current.data < rightMax) {
          rightMax = current.data;
        }

        if (current.left != null) {
          path.offer(current.left);
        }
        if (current.right != null) {
          path.offer(current.right);
        }
      }
    }

    if (leftMax != Integer.MIN_VALUE && root.data < leftMax) {
      return false;
    }
    if (rightMax != Integer.MAX_VALUE && root.data > rightMax) {
      return false;
    }

    if (leftMax != Integer.MIN_VALUE && root.right != null) {
      Queue<Node> path = new ArrayDeque<>();
      path.offer(root.right);

      while(!path.isEmpty()) {
        Node current = path.poll();

        if (current.data < leftMax) {
          return false;
        }

        if (current.left != null) {
          path.offer(current.left);
        }
        if (current.right != null) {
          path.offer(current.right);
        }
      }
    }

    if (rightMax != Integer.MAX_VALUE && root.left != null) {
      Queue<Node> path = new ArrayDeque<>();
      path.offer(root.left);

      while(!path.isEmpty()) {
        Node current = path.poll();

        if (current.data > rightMax) {
          return false;
        }

        if (current.left != null) {
          path.offer(current.left);
        }
        if (current.right != null) {
          path.offer(current.right);
        }
      }
    }

    Queue<Node> path = new ArrayDeque<>();
    path.offer(root);

    while(!path.isEmpty()) {
      Node current = path.poll();

      if (current.left != null && current.left.data > current.data) {
        return false;
      }
      if (current.right != null && current.right.data < current.data) {
        return false;
      }

      if (current.left != null) {
        path.offer(current.left);
      }
      if (current.right != null) {
        path.offer(current.right);
      }
    }

    return true;
  }
}
