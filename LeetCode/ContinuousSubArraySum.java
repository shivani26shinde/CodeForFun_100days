// LeetCode --> Q.523 --> Continuous SubArray Sum

class ContinuousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 1;
        for(int i=0;i<nums.length-1;i++){
            sum = nums[i];
            count = 1;
            for(int j=i+1;j<nums.length;j++){
                sum = sum + nums[j];
                count++;
                if(count>=2 && sum == 0 && k == 0){
                    return true;
                }
                else if(count>=2 && sum > 0 && k == 0){
                    return false;
                }
                else if(count>=2 && sum%k == 0){
                    return true;
                }
            }
        }
        return false;
    }
}