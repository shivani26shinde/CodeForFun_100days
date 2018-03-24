// Longest Non-Continuous Increasing Sub-Sequence

class NonContSubSeq {
    public int findLengthOfLCIS(int[] nums) {
        int[] array = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            array[i] = 1;
        }
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] > nums[i]){
                    array[j] = Math.max(array[j], array[i]+1);
                    max = Math.max(max,array[j]);
                }
            }
        }
        return max;
    }
}