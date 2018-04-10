// LeetCode --> Q.697 --> Degree of an array

class ArrayDegree {
    public int findShortestSubArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int numsMin = findDegree(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int[] arr = Arrays.copyOfRange(nums, i, j+1);
                int val = findDegree(arr);
                if(numsMin == val){
                    min = Math.min(min, arr.length);
                }
            }
        }
        return min;
    }
    public int findDegree(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int val = map.get(array[i]);
                map.put(array[i], val+1);
            }
            else{
                map.put(array[i], 1);
            }
            max = Math.max(max, map.get(array[i]));
        }
        return max;
    }
}