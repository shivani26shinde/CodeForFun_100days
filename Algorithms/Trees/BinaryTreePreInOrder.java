// LeetCode --> Q.105 -- Binary Tree from PreOrder and InOrder

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreePreInOrder {
    static int num = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start = 0;
        int end = preorder.length-1;
        return Create(preorder, inorder, start, end);
    }
    
    public TreeNode Create(int[] preorder, int[] inorder, int start, int end){
        if(start>end){
            return null;
        }
        TreeNode node = new TreeNode(preorder[num++]);
        if(start == end){
            return node;
        }
        int val = 0;
        for(int i=start;i<=end;i++){
            if(inorder[i] == node.val){
                val = i;
                break;
            }
        }
        node.left = Create(preorder, inorder, start, val-1);
        node.right = Create(preorder, inorder, val+1, end);
        return node;
    }
}