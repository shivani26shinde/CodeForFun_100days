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
        char[] myChar = S.toCharArray();
        for(int i=0;i<myChar.length;i++){
            long sum = 0;
            for(int j=i;j<shifts.length;j++){
                sum = sum+shifts[j];     
            }
            long value = (long) (mapNum.get(myChar[i])) + sum;
            int val = (int) (value%26);
            myChar[i] = map.get(val);            
        }
        S = String.valueOf(myChar);
        return S;
    }
}