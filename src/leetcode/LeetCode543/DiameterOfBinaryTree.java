package leetcode.LeetCode543;

/* https://leetcode.com/problems/diameter-of-binary-tree/description */

public class DiameterOfBinaryTree {

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        traversal(root);
        return diameter;
    }
    private int traversal(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = traversal(root.left);
        int right = traversal(root.right);
        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
}
