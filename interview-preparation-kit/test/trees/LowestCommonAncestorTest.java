package trees;

import static trees.Node.insert;

import org.junit.Assert;
import org.junit.Test;

public class LowestCommonAncestorTest {
  @Test
  public void lcaTest1() {
    Node root = null;
    int[] nodeValues = { 4, 2, 3, 1, 7, 6 };
    for (int i = 0; i < nodeValues.length; i++) {
      root = insert(root, nodeValues[i]);
    }
    Assert.assertEquals(4, LowestCommonAncestor.lca(root, 1, 7).data);
  }

  @Test
  public void lcaTest2() {
    Node root = null;
    int[] nodeValues = { 8, 4, 9, 1, 2, 3, 6, 5 };
    for (int i = 0; i < nodeValues.length; i++) {
      root = insert(root, nodeValues[i]);
    }
    Assert.assertEquals(1, LowestCommonAncestor.lca(root, 1, 2).data);
  }
}
