package trees;

import static trees.Node.insert;

import org.junit.Assert;
import org.junit.Test;

public class HeightOfABinaryTreeTest {
  @Test
  public void heightTest1() {
    Node root = null;
    int[] nodeValues = { 3, 2, 1, 5, 4, 6, 7 };
    for (int i = 0; i < nodeValues.length; i++) {
      root = insert(root, nodeValues[i]);
    }
    Assert.assertEquals(3, HeightOfABinaryTree.height(root));
  }

  @Test
  public void heightTest2() {
    Node root = null;
    int[] nodeValues = { 3, 1, 7, 5, 4 };
    for (int i = 0; i < nodeValues.length; i++) {
      root = insert(root, nodeValues[i]);
    }
    Assert.assertEquals(3, HeightOfABinaryTree.height(root));
  }

  @Test
  public void heightTest3() {
    Node root = null;
    int[] nodeValues = { 1, 3, 2, 5, 4, 6, 7, 9, 8, 11, 13, 12, 10, 15, 14 };
    for (int i = 0; i < nodeValues.length; i++) {
      root = insert(root, nodeValues[i]);
    }
    Assert.assertEquals(9, HeightOfABinaryTree.height(root));
  }
}
