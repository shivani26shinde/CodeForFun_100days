// LeetCode --> Q.674 --> Longest Continuous Increasing Subsequence

class LongContIncSubSeq {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}