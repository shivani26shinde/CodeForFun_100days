// LeetCode --> Q.503 --> Next Greater Element 2

class NextGreaterElementTwo {
    public int[] nextGreaterElements(int[] nums) {
        int[] array = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<i+nums.length){
                int val = j%nums.length;
                if(nums[val] > nums[i]){
                    array[i] = nums[val];
                    break;
                }
                j++;
            }
            if(j == i+nums.length){
                array[i] = -1;
            }
        }
        return array;
    }
}