// Leetcode --> Virtual Contest 2 --> Minimum Distance between BST nodes

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MDBSTN {
    static PriorityQueue<Integer> q = new PriorityQueue<Integer>();   
    public int minDiffInBST(TreeNode root) {
        BinaryTree(root);
        int min = Integer.MAX_VALUE;
        int num1 = q.remove();
        while(!q.isEmpty()){
            int num2 = q.remove();
            int diff = num2-num1;
            min = Math.min(min,diff);
            num1 = num2;
        }
        return min;
    }
    static void BinaryTree(TreeNode root){
        if(root == null){
            return;
        }
        q.add(root.val);      
        BinaryTree(root.left);
        BinaryTree(root.right);
    }
}