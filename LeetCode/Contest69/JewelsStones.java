// LeetCode --> Weekly Contest 69 --> Question 1 --> Jewels and Stones

class JewelsStones {
    HashSet<Character> jwl = new HashSet<>();
    HashMap<Character, Integer> str = new HashMap<>();
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i=0;i<J.length();i++){
            char c = J.charAt(i);
            jwl.add(c);
        }
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(jwl.contains(c)){
                count++;
            }
        }
        return count;
    }
}