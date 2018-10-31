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

    Assert.assertTrue(new BSTVerifier().checkBST(root));
  }

  @Test
  public void checkBSTTest2() {
    Node root = new Node(3);
    root.left = new Node(2);
    root.left.left = new Node(1);
    root.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(1);

    Assert.assertTrue(new BSTVerifier().checkBST(root));
  }
}
