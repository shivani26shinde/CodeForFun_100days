// LeetCode --> Q.508 --> Most Frequent Sub-Tree Sum

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MostFreqSubTreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int max = 0;
        sum = TreeTraversal(root, list);
        for(int i=0;i<list.size();i++){
            if(map.containsKey(list.get(i))){
                int val = map.get(list.get(i));
                map.put(list.get(i), val+1);
            }
            else{
                map.put(list.get(i), 1);
            }
            max = Math.max(max, map.get(list.get(i)));
        }
        for(Integer k: map.keySet()){
            if(map.get(k) == max){
                set.add(k);
            }
        }
        int[] array = new int[set.size()];
        int start = 0;
        for(Integer s: set){
            array[start] = s;
            start++;
        }
        return array;
    }
    public int TreeTraversal(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return 0;
        }
        int Lsum = TreeTraversal(root.left, list);
        int Rsum = TreeTraversal(root.right, list);
        int totalSum =  Lsum+Rsum+root.val;
        list.add(totalSum);
        return totalSum;
    }
    
}