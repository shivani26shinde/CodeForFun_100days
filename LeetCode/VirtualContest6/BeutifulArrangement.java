// LeetCode --> Q.526 --> Beautiful Arrangement

class BeutifulArrangement {
    public int countArrangement(int N) {
        int[] array = new int[N];
        for(int i=0;i<N;i++){
            array[i] = i+1;
        }
        int val = Count(0,array,N,0);
        return val;
    }
    public int Count(int start, int[] array, int N, int count){
        if(start == N){
            count++;
            return count;
        }
        for(int i=start;i<N;i++){
            if(array[i]%(start+1) == 0 || (start+1)%array[i] == 0 || array[start]%(i+1) == 0 || (i+1)%array[start] == 0){
                array = Swap(array,i,start);
                count = Count(i+1,array,N,count);
                array = Swap(array,i,start);
            }
        }
        return count;
    }
    public int[] Swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}