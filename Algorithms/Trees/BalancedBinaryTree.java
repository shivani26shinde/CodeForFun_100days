// LeetCode --> Q.110 --> Balanced Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return Check(root);
    }
    public boolean Check(TreeNode root){
        if(root == null){
            return true;
        }
        int left = Depth(root.left);
        int right = Depth(root.right);
        if(Math.abs(left-right) <= 1 && Check(root.left) && Check(root.right)){
            return true;
        }
        return false;
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