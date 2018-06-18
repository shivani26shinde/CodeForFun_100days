// LeetCode --> Q.848 --> Shifting Letters

class ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        HashMap<Integer,Character> map = new HashMap<>();
        HashMap<Character,Integer> mapNum = new HashMap<>();
        int num=0;
        for(char c='a'; c<='z'; c++){
            map.put(num,c);
            mapNum.put(c,num);
            num++;
        }
        for(int i=0;i<shifts.length;i++){
            int shift = shifts[i];
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<i+1;j++){
                int val = (mapNum.get(S.charAt(j))+shift)%26;
                char c = map.get(val);
                sb.append(c);
            }
            if(i+1<S.length()){
                S = sb.toString() + S.substring(i+1,S.length());
            }
            else{
                S = sb.toString();
            }
        }
        return S;
    }
}