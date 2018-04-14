// Split array into two arrays with Same average
// Solution 2

class Solution2 {
    public boolean splitArraySameAverage(int[] A) {
        int total = 0;
        if(A.length<=1){
            return false;
        }
        for(int i=0;i<A.length;i++){
            total = total+A[i];
        }
        int left = 0;
        int right = 0;
        for(int i=0;i<A.length-1;i++){
            left = left+A[i];
            right = total-left;
            int avgL = left*(A.length-i-1);
            int avgR = right*(i+1);
            if(avgL == avgR){
                return true;
            }
        }
        return false;
    } 
}