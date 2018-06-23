// LeetCode --> Q.852 --> Peak Index

class PeekIndex {
    public int peakIndexInMountainArray(int[] A) {
        int len = A.length;
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int i=0;i<len;i++){
            if(A[i]>max){
                max=A[i];
                num = i;
            }
        }
        return num;
    }
}