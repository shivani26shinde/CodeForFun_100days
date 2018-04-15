// LeetCode --> Q.819 --> Most Common Word

class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String retWord = "";
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        paragraph = paragraph.toLowerCase();
        String[] array = paragraph.split("[\\p{Punct}\\s]+");
        for(int i=0;i<array.length;i++){
            String word = array[i];
            if(!set.contains(word)){
                if(map.containsKey(word)){
                    int val = map.get(word);
                    map.put(word, val+1);
                }
                else{
                    map.put(word, 1);
                }
                if(map.get(word) > max){
                    retWord = word;
                    max = map.get(word);
                }
            }
        }
        return retWord;
    }
}