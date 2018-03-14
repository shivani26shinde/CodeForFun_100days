// LeetCode --> Q.796 --> Rotate String

class RotateString {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        for(int i=0;i<A.length();i++){
            for(int j=0;j<A.length();j++){
                if(A.charAt((i+j) % A.length()) != B.charAt(j)){
                    continue;
                }
            }
            return true;
        }
        return false;
    }
}