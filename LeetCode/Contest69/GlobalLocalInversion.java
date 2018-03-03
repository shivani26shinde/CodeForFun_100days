// LeetCode --> Weekly Contest 69 --> Question 2 --> Global and Local Inversion

class GlobalLocalInversion {
    public boolean isIdealPermutation(int[] A) {
        int[] Anew = new int[A.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]);
        }
        Collections.sort(list);
        for(int i=0;i<A.length;i++){
            Anew[i] = list.indexOf(A[i]) + 1;
        }
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<Anew.length-1;i++){
           for(int j=i+1;j<Anew.length;j++){
               if(j == i+1){
                   if(Anew[i]>Anew[j]){
                       count2++;
                       count1++;
                   }
               }
               else{
                   if(Anew[i]>Anew[j]){
                       count1++;
                   }
               }
           }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}