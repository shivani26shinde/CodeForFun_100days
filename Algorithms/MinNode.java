// Min Node

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinNode {
    public int findSecondMinimumValue(TreeNode root) {
        return SecondMin(root);
    }
    public int SecondMin(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        if(root.left == null && root.right == null){
            return root.val;
        }
        int left = SecondMin(root.left);
        int right = SecondMin(root.right);
        return Math.min(left,right);
    }
}