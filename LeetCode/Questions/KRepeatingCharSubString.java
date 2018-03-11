// LeetCode --> Q.395 --> Longest Substring with At Least K Repeating Characters

class KRepeatingCharSubString {
    public int longestSubstring(String s, int k) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int val = map.get(s.charAt(i));
                map.put(s.charAt(i), val+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        int max = 0;
        for(char c: map.keySet()){
            if(map.get(c) >= k){
                //int beg = s.indexOf(c);
                int end = s.lastIndexOf(c);
                max = Math.max(max,end+1);
            }
        }
        return max;
    }
}