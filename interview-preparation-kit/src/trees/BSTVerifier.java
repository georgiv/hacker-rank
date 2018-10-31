package trees;

public class BSTVerifier {
  boolean checkBST(Node root) {
    return verify(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean verify(Node root, int min, int max){
    if(root == null) return true;

    if (root.data <= min || root.data >= max) return false;

    return verify(root.left, min, root.data) && verify(root.right, root.data, max);
  }
}
