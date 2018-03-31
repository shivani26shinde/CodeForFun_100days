// LeetCode --> Q.496 --> Next Greater Element 1

class NextGreaterElementOne {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i], i);
        }
        for(int i=0;i<nums1.length;i++){
            int val = nums1[i];
            if(map.containsKey(val)){
                int index = map.get(val)+1;
                while(index < nums2.length){
                    if(nums2[index] > val){
                        array[i] = nums2[index];
                        break;
                    }
                    index++;
                }
                if(index == nums2.length){
                    array[i] = -1;
                }
            }
            else{
                array[i] = -1;
            }
        }
        return array;
    }
}
