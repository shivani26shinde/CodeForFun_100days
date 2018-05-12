// LeetCode --> Q.129 --> Sum Root to Leaf Nodes

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return Count(root,new StringBuilder());
    }
    public int Count(TreeNode root, StringBuilder sb){
        if(root == null){
            return 0;
        }
        sb.append(root.val);
        if(root.left == null && root.right == null){
            return Integer.parseInt(sb.toString());
        }
        int left = Count(root.left,sb);
        if(sb.length() > 0){
          sb.deleteCharAt(sb.length()-1);  
        }
        int right = Count(root.right,sb);
        if(sb.length() > 0){
          sb.deleteCharAt(sb.length()-1);  
        } 
        return left+right;
    }
}