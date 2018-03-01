// LeetCode --> Virtual Contest --> Rotate Function

class RotateFunction {
    public int maxRotateFunction(int[] A) {
        int len = A.length;
        if(len == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            int j=i;
            int num=0;
            int sum = 0;
            while(num<A.length){
                sum = sum+(num * A[(j%len)]);
                num++;
                j++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}