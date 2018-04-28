// LeetCode --> Q.102 --> Binary Tree Level Order Traversal

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeLevelTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        if(root == null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int num = q.size();
            l1 = new ArrayList<>();
            if(num == 0){
                break;
            }
            while(num != 0){
                TreeNode node = q.peek();
                l1.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                q.remove();
                num--;
            }
            list.add(l1);
        }
        return list;
    }
}