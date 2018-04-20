// LeetCode --> Q.114 --> Binary Tree to Linked List

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryLinkedList {
    public void flatten(TreeNode root) {
        TreeNode node = root;
        Stack<TreeNode> st = new Stack<>();
        while(node != null || !st.isEmpty()){
            if(node.right != null){
                st.push(node.right);
            }
            if(node.left != null){
                node.right = node.left;
                node.left = null;
            }
            else{
                if(!st.isEmpty()){
                    TreeNode temp = st.pop();
                    node.right = temp;
                }
            }
            node = node.right;
        }
    }
    
}