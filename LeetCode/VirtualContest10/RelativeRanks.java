// LeetCode --> Q.506 --> Relative Ranks

class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
            map.put(nums[i], i);
        }
        Map<Integer, Integer> rankMap = new TreeMap<>();
        int start = 1;
        while(!q.isEmpty()){
            int val = q.remove();
            int index = map.get(val);
            rankMap.put(index, start);
            start++;
        }
        for(Integer i: rankMap.keySet()){
            int num = rankMap.get(i);
            if(num == 1){
                str[i] = "Gold Medal";
            }
            else if(num == 2){
                str[i] = "Silver Medal";
            }
            else if(num == 3){
                str[i] = "Bronze Medal";
            }
            else{
                str[i] = num + "";
            }
        }
        return str;
    }
}