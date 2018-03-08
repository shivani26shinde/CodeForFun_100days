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
class BinaryString {
    static StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode t) {
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
        sb.append("(");
        sb.append(t.val);
        CreateString(t.left);
        sb.append(")");
        CreateString(t.right);
    }
}