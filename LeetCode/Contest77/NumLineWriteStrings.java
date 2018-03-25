// LeetCode --> Q.806 --> Number of Lines to Write String

class NumLineWriteStrings {
    public int[] numberOfLines(int[] widths, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        char c;
        int i;
        for(c='a',i=0; c<='z' && i<widths.length; c++,i++){
            map.put(c, widths[i]);
        }
        int line = 1;
        int start = 0;
        int val = 0;
        while(start<S.length()){
            int num = map.get(S.charAt(start));
            if(val+num <= 100){
                val = val+num;
            }
            else{
                line++;
                val = num;
            }
            start++;
        }
        int[] array = new int[2];
        array[0] = line;
        array[1] = val;
        return array;
    }
}