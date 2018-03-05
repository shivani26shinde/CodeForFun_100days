// LeetCode --> Contest 74 -->  Question 3 --> Number of SubArrays Bounded

class SubArraysBounded {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int count = 0;
        for(int i=0;i<A.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<A.length;j++){
                max = Math.max(max, A[j]);
                if(max >= L && max <= R){
                    count++;
                }
            } 
        }
        return count;
    }
}