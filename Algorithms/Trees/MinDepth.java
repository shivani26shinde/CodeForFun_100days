// LeetCode --> Q.111 --> Minimum depth of Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinDepth {
    public int minDepth(TreeNode root) {
        return Depth(root);
    }
    public int Depth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left == null){
            return 1+Depth(root.right);
        }
        if(root.right == null){
            return 1+Depth(root.left);
        }
        int left = Depth(root.left);
        int right = Depth(root.right);
        return 1+Math.min(left, right);
    }
}