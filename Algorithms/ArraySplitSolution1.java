// Split array into two arrays with Same average
// Solution 1

class Solution1 {
    public boolean splitArraySameAverage(int[] A) {
        if(A.length <= 1){
            return false;
        }
        ArrayList<Integer> listB = new ArrayList<>();
        ArrayList<Integer> listC = new ArrayList<>();
        for(int i=0;i<A.length-1;i++){
            listB.add(A[i]);
        }
        listC.add(A[A.length-1]);
        int numB = listB.size();
        int numC = listC.size();
        int sumB = Sum(listB);
        int sumC = Sum(listC);
        int pointer = listB.size()-1;
        double avgB = 0;
        double avgC = 0;
        while(numB > numC){
            avgB = sumB/numB;
            avgC = sumC/numC;
            if(avgB == avgC){
                return true;
            }
            int val = listB.get(pointer);
            sumB = sumB-val;
            sumC = sumC+val;
            numB--;
            numC++;
            pointer--;
        }
        return false;
    } 
    public int Sum(ArrayList<Integer> list){
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum = sum+list.get(i);
        }
        return sum;
    }
}