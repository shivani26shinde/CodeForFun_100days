// LeetCode --> Q.392 --> Is Subsequence

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        int[][] array = new int[s.length()+1][t.length()+1];
        for(int i=0;i<array.length;i++){
            array[i][0] = 0;
        }
        for(int i=0;i<array[0].length;i++){
            array[0][i] = 0;
        }
        for(int i=1;i<array.length;i++){
            for(int j=1;j<array[0].length;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    array[i][j] = array[i-1][j-1] + 1;
                }
                else{
                    array[i][j] = Math.max(array[i-1][j], array[i][j-1]);
                }
				if(array[i][j] == s.length()){
					return true;
				}
            }
        }   
        if(array[s.length()][t.length()] == s.length()){
            return true;
        }
        return false;
    }
}

class IsSubsequenceOptimal {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        int start1 = 0;
        int start2 = 0;
        while(start1 < s.length() && start2 < t.length()){
            if(s.charAt(start1) == t.charAt(start2)){
                start1++;
                start2++;
            }
            else{
                start2++;
            }
        }
        if(start1 == s.length()){
            return true;
        }
        return false;
    }
}