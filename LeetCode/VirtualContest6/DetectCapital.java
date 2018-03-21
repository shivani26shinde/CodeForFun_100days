// LeetCode

class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if(len == 0){
            return false;
        }
        if(Character.isLowerCase(word.charAt(0))){
            for(int i=1;i<len;i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            int j=1;
            int count1 = 0;
            int count2 = 0;
            while(j<len){
                if(Character.isUpperCase(word.charAt(j))){
                    count1++;
                }
                else{
                    count2++;
                }
                j++;
            }
            if(count1 == len-1 || count2 == len-1){
                return true;
            }
        }
        return false;
    }
}