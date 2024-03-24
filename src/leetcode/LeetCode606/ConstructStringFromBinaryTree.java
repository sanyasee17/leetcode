package leetcode.LeetCode606;

// https://leetcode.com/problems/construct-string-from-binary-tree/

public class ConstructStringFromBinaryTree {
    public static void main(String[] args) {

    }
    public String tree2str(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        getString(root, ans);
        return ans.toString();
    }

    // Tree Traversal
    private void getString(TreeNode root, StringBuilder ans) {
        if(root == null) {
            return;
        }
        ans.append("(");
        ans.append(root.val);
        getString(root.left , ans);
        if(root.left == null && root.right != null) {
            ans.append("()");
        }
        getString(root.right, ans);
        ans.append(")");
    }
}


// Definition for a binary tree node.
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

