// LeetCode --> Virtual Contest --> Random Pick Index

class RandomPickIndex {
    static HashMap<Integer, ArrayList<Integer>> map;
    public Solution(int[] nums) {
        map = new HashMap<Integer, ArrayList<Integer>>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
    }
    
    public int pick(int target) {
        ArrayList<Integer> list = map.get(target);
        int random = list.get(new Random().nextInt(list.size()));
        return random;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */