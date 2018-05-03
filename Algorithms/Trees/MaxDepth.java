// LeetCode --> Q.104 --> Maximum depth of Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaxDepth {
    public int maxDepth(TreeNode root) {
        return Depth(root);
    }
    public int Depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Depth(root.left);
        int right = Depth(root.right);
        return 1+Math.max(left, right);
    }
}