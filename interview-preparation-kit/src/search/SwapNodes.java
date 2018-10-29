package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TreeNode {
  private int value;
  private int depth;
  private TreeNode leftChild;
  private TreeNode rightChild;

  TreeNode(int value, int depth) {
    this.value = value;
    this.depth = depth;
  }

  public int getValue() {
    return value;
  }

  public int getDepth() {
    return depth;
  }

  public TreeNode getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode getRightChild() {
    return rightChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }
}

public class SwapNodes {
  static int[][] swapNodes(int[][] indexes, int[] queries) {
    TreeNode root = new TreeNode(1, 1);

    Queue<TreeNode> traverseQueue = new LinkedList<>();
    traverseQueue.offer(root);
    for (int i = 0; i < indexes.length; i++) {
      TreeNode currentNode = traverseQueue.poll();
      int currentDepth = currentNode.getDepth();

      if (indexes[i][0] != -1) {
        TreeNode leftChild = new TreeNode(indexes[i][0], currentDepth + 1);
        currentNode.setLeftChild(leftChild);
        traverseQueue.offer(leftChild);
      }

      if (indexes[i][1] != -1) {
        TreeNode rightChild = new TreeNode(indexes[i][1], currentDepth + 1);
        currentNode.setRightChild(rightChild);
        traverseQueue.offer(rightChild);
      }
    }

    int[][] res = new int[queries.length][];

    for (int i = 0; i < queries.length; i++) {
      Deque<TreeNode> traversePath = new ArrayDeque<>();
      traversePath.offer(root);

      while (!traversePath.isEmpty()){
        TreeNode currentNode = traversePath.poll();
        int currentDepth = currentNode.getDepth();

        TreeNode leftChild = currentNode.getLeftChild();
        if (leftChild != null) {
          traversePath.offer(leftChild);
        }
        TreeNode rightChild = currentNode.getRightChild();
        if (rightChild != null) {
          traversePath.offer(rightChild);
        }

        if (currentDepth % queries[i] == 0) {
          currentNode.setLeftChild(rightChild);
          currentNode.setRightChild(leftChild);
        }
      }

      List<Integer> path = new ArrayList<>();
      inOrderTraversal(root, path);
      res[i] = new int[path.size()];
      for (int j = 0; j < path.size(); j++) {
        res[i][j] = path.get(j);
      }
    }

    return res;
  }

  static void inOrderTraversal(TreeNode root, List<Integer> path) {
    if (root != null) {
      inOrderTraversal(root.getLeftChild(), path);
      path.add(root.getValue());
      inOrderTraversal(root.getRightChild(), path);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());
    int[][] indexes = new int[n][2];
    for (int i = 0; i < n; i++) {
      String[] nodes = in.readLine().split(" ");
      indexes[i][0] = Integer.parseInt(nodes[0]);
      indexes[i][1] = Integer.parseInt(nodes[1]);
    }

    int t = Integer.parseInt(in.readLine());
    int[] queries = new int[t];
    for (int i = 0; i < t; i++) {
      queries[i] = Integer.parseInt(in.readLine());
    }

    int[][] swapped = swapNodes(indexes, queries);
    for (int i = 0; i < swapped.length; i++) {
      for (int j = 0; j < swapped[i].length - 1; j++) {
        System.out.print(swapped[i][j] + " ");
      }
      System.out.println(swapped[i][swapped[i].length - 1]);
    }
  }
}
