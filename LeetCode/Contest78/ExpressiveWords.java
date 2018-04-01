// LeetCode --> Q.809 --> Expressive Words

class ExpressiveWords {
    public int expressiveWords(String S, String[] words) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c, val+1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(int i=0;i<words.length;i++){
            String str = words[i];
            Map<Character, Integer> mapWord = new LinkedHashMap<>();
            for(int j=0;j<str.length();j++){
                char c = str.charAt(j); 
                if(mapWord.containsKey(c)){
                    int val = mapWord.get(c)+1;
                    mapWord.put(c, val);
                }
                else{
                    mapWord.put(c, 1);
                }
            }
            boolean flag = true;
            if(map.size() != mapWord.size()){
                flag = false;
            }
            else{
                for(Character ch: mapWord.keySet()){
                    if(!map.containsKey(ch)){
                        flag = false;
                        break;
                    }
                    else{
                        int c1 = map.get(ch);
                        int c2 = mapWord.get(ch);
                        if(c1 != c2){
                            if(c2 > c1 || c1-c2 < 2){
                                flag = false;
                                break;
                            }
                        }
                    }
                }
            }
            if(flag == true){
                count++;
            }
        }
        return count;
    }
}