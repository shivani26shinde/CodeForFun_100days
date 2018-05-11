// LeetCode --> Q.120 --> Triangle

class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size()-1;
        int[] array = new int[len+1];
        for(int i=0;i<=len;i++){
            array[i] = triangle.get(len).get(i);
        }
        for(int i=len-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                array[j] = Math.min(array[j],array[j+1])+triangle.get(i).get(j);
            }
        }
        return array[0];
    }
}