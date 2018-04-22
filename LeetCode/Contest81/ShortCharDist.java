// LeetCode --> Q.821 --> Shortest Distance to a Character

class ShortCharDist {
    public int[] shortestToChar(String S, char C) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<S.length();i++){
            if(C == S.charAt(i)){
                list.add(i);
            }
        }
        int[] array = new int[S.length()];
        for(int i=0;i<S.length();i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<list.size();j++){
                min = Math.min(min, Math.abs(i-list.get(j)));
            }
            array[i] = min;
        }
        return array;
    }
}