// LeetCode --> Q.530 --> Minimum Absolute Difference in BST

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinAbsDiff {
    public int getMinimumDifference(TreeNode root) {
        return MinValue(root, null, Integer.MAX_VALUE);
    }
    public int MinValue(TreeNode root, TreeNode node, int min){
        if(root == null){
            return min;
        }
        min = MinValue(root.left, node, min);
        if(node != null){
            min = Math.min(min, (root.val - node.val));
        }
        node = root;
        min = MinValue(root.right, node, min);
        return min;
    }
}