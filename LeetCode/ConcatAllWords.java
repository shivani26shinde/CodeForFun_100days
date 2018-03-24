// LeetCode --> Q.30 --> Substring with concatenation of all words

class ConcatAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        int len = words.length;
        Set<String> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        if(len == 0){
            return list;
        }
        int num = len*(words[0].length());
        set = Generate(0,words,set);
        for(int i=0;i<=s.length()-num;i++){
            String str = s.substring(i,i+num);
            if(set.contains(str)){
                list.add(i);
            }
        }
        return list;
    }
    public Set<String> Generate(int start, String[] words, Set<String> set){
        if(start == words.length){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<words.length;j++){
                sb.append(words[j]);
            }
            set.add(sb.toString());
            return set;
        }
        for(int i=start;i<words.length;i++){
            words = Swap(words,i,start);
            set = Generate(start+1,words,set);
            words = Swap(words,i,start);
        }
        return set;
    }
    public String[] Swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}