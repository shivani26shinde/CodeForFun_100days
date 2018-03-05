// LeetCode --> Contest 74 -->  Question 2 --> Number of Matching Subsequences

class MatchingSubsequences {
    public int numMatchingSubseq(String S, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String temp = words[i];
            if(temp.length() <= S.length()){
                int pos1=0;
                int pos2=0;
                while(pos1<temp.length() && pos2<S.length()){
                   if(temp.charAt(pos1) == S.charAt(pos2)){
                       pos1++;
                       pos2++;
                   }
                    else{
                        pos2++;
                    }
                }
                if(pos1 == temp.length()){
                    count++;
                }
            }
        }
        return count;
    }
}