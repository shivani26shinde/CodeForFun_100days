/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start = 0;
        int end = preorder.length-1;
        return Create(preorder, inorder, start, end, 0);
    }
    
    public TreeNode Create(int[] preorder, int[] inorder, int start, int end, int num){
        if(start>end){
            return null;
        }
        TreeNode node = new TreeNode(preorder[num++]);
        if(start == end){
            return node;
        }
        int val = 0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i] == preorder[num]){
                val = i;
                break;
            }
        }
        node.left = Create(preorder, inorder, start, val-1, num);
        node.right = Create(preorder, inorder, val+1, end, num);
        return node;
    }
}