// LeetCode --> Q.830 --> Positions of Large Groups

class LargeGroupPos {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        while(i<S.length()){
            int val = 0;
            int start = i;
            char c = S.charAt(i);
            while(i < S.length() && c == S.charAt(i)){
                val++;
                i++;
            }
            if(val >= 3){
                List<Integer> l = new ArrayList<>();
                l.add(start);
                l.add(start+val-1);
                list.add(l);
            }
        }
        return list;
    }
}