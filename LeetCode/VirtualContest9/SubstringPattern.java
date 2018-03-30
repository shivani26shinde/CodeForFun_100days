// LeetCode --> Q.459 --> Repeated Substring Pattern

class SubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if(len <= 1){
            return false;
        }
        for(int i=1;i<=len/2;i++){
            String str = s.substring(0,i);
            int mul = 0;
            StringBuilder sb = new StringBuilder();
            while(mul < len){
                sb.append(str);
                mul = mul + str.length();
            }
            str = sb.toString();
            if(str.matches(s)){
                return true;
            }
        }
        return false;
    }
}