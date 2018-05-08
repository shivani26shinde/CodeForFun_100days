// LeetCode --> Q.824 --> Goat Latin

class GoatLatin {
    public String toGoatLatin(String S) {
        Set<Character> chars = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder sb = new StringBuilder();
        String temp = "";
        String[] arr = S.split(" ");
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            if(chars.contains(word.charAt(0))){
                temp = word + "ma";
            }
            else{
                temp = word.substring(1,word.length()) + word.charAt(0) + "ma";
            }
            for(int j=0;j<=i;j++){
                temp = temp + 'a';
            }
            sb.append(temp);
            if(i<arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}