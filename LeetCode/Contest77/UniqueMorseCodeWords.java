// Leetcode --> Q.804 --> Unique Morse Code Words

class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> map = new HashMap<>();
        char c;
        int k;
        for(c='a',k=0; c<='z' && k<array.length; c++,k++){
            map.put(c, array[k]);
        }
        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String str = words[i];
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<str.length();j++){
                sb.append(map.get(str.charAt(j)));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
} 