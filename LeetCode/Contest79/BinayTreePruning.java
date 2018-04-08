// LeetCode --> Q.814 --> Binary Tree Pruning

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinayTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        root = Iterate(root, root);
        return root;
    }
    public TreeNode Iterate(TreeNode root, TreeNode parent){
        if(root == null){
            return null;
        }
        root.left = Iterate(root.left, root);
        root.right = Iterate(root.right, root);
        if(root.left == null && root.right == null){
            if(root.val == 0){
                root = null;
            }
            return root;
        }
        return root;
    }
}