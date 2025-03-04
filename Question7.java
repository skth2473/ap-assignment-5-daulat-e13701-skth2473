
public class Question7 {
    int val;
    TreeNode left;
    TreeNode right;
    Question7() {}
    Question7(int val) { this.val = val; }
    Question7(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
  public int maxDepth(TreeNode root) {
      
      if (root == null) return 0;
      int leftDepth = maxDepth(root.left);
      int rightDepth = maxDepth(root.right);

      return 1 + Math.max(leftDepth, rightDepth);
  }
}