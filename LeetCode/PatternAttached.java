// LeetCode (Modified) --> Find 132 pattern attached

class PatternAttached {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            leftMax = Math.max(leftMax, nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            rightMax = Math.max(rightMax, nums[i]);
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] == leftMax && nums[i] == rightMax){
                if(nums[i-1] < nums[i+1]){
                    return true;
                }
            }
        }
        return false;
    }
}