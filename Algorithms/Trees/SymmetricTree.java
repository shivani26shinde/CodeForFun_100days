// LeetCode --> Q.101 --> Symmetric Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1 = SymLeft(root, list1);
        list2 = SymRight(root, list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
    public ArrayList<Integer> SymLeft(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            list.add(0);
            return list;
        }
        list.add(root.val);
        list = SymLeft(root.left, list);
        list = SymLeft(root.right, list);
        return list;
    }
    public ArrayList<Integer> SymRight(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            list.add(0);
            return list;
        }
        list.add(root.val);
        list = SymRight(root.right, list);
        list = SymRight(root.left, list);
        return list;
    }
}