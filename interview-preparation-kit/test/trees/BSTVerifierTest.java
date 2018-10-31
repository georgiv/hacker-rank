package trees;

import org.junit.Assert;
import org.junit.Test;

public class BSTVerifierTest {
  @Test
  public void checkBSTTest1() {
    Node root = new Node(3);
    root.left = new Node(2);
    root.left.left = new Node(1);
    root.right = new Node(4);
    root.right.left = new Node(5);
    root.right.right = new Node(6);

    Assert.assertFalse(new BSTVerifier().checkBST(root));
  }

  @Test
  public void checkBSTTest2() {
    Node root = new Node(3);
    root.left = new Node(2);
    root.left.left = new Node(1);
    root.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(1);

    Assert.assertFalse(new BSTVerifier().checkBST(root));
  }

  @Test
  public void checkBSTTest3() {
    Node root = new Node(30);
    root.left = new Node(5);
    root.right = new Node(40);
    root.right.left = new Node(10);
    root.right.right = new Node(50);

    Assert.assertFalse(new BSTVerifier().checkBST(root));
  }

  @Test
  public void checkBSTTest4() {
    Node root = new Node(8);
    root.left = new Node(4);
    root.left.left = new Node(2);
    root.left.left.left = new Node(1);
    root.left.left.right = new Node(3);
    root.left.right = new Node(6);
    root.left.right.left = new Node(5);
    root.left.right.right = new Node(7);
    root.right = new Node(13);
    root.right.left = new Node(10);
    root.right.left.left = new Node(9);
    root.right.left.right = new Node(11);
    root.right.right = new Node(14);
    root.right.right = new Node(14);
    root.right.right.left = new Node(12);
    root.right.right.right = new Node(15);

    Assert.assertFalse(new BSTVerifier().checkBST(root));
  }
}
