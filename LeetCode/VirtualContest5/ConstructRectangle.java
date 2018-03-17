// LeetCode --> Q.492 --> Construct the rectangle

class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int min = Integer.MAX_VALUE;
        int[] finalAns = new int[2];
        int L = 0;
        int W = 0;
        for(int i=1;i<=Math.sqrt(area);i++){
            if(area % i == 0){
                L = i;
                W = area/i;
                if(L < W){
                    int temp = W;
                    W = L;
                    L = temp;
                }
                int diff = L-W;
                if(diff<min){
                    finalAns[0] = L;
                    finalAns[1] = W;
                    min = diff;
                }
            }
        }
        return finalAns;
    }
}