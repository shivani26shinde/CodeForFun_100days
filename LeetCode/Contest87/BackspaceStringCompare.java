// LeetCode --> Q.844 --> Backspace String Compare

class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        String one = back(S);
        String two = back(T);
        System.out.println(one+"  "+two);
        if(one.equals(two)){
            return true;
        }
        return false;
    }
    public String back(String s){
        int p1 = 0;
        StringBuilder sb = new StringBuilder();
        while(p1<s.length()){
            if(s.charAt(p1) == '#'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(s.charAt(p1));
            }
            p1++;
        }
        return sb.toString();
    }
}