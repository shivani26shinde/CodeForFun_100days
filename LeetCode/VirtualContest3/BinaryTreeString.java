// LeetCode --> Virtual Contest --> Question 2 --> Construct String from Binary

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeString {
    static StringBuilder sb;
    public String tree2str(TreeNode t) {
        sb = new StringBuilder();
        if(t == null){
            return "";
        }
        CreateString(t);
        return sb.toString();
    }
    public void CreateString( TreeNode t ){
        if(t == null){
            return;
        }
        sb.append(t.val);
        if(t.left == null && t.right == null){
            return;
        }
        sb.append("(");
        CreateString(t.left);
        sb.append(")");
        if(t.right != null){
            sb.append("(");
            CreateString(t.right);
            sb.append(")");
        }
    }
}