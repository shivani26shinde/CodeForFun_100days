// LeetCode --> Q.796 --> Rotate String

// In progress
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

// Correct Code
class RotateString {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        for(int i=0;i<A.length();i++){
			String sub1 = A.substring(0,i);
			String sub2 = A.substring(i,A.length());
			String str = sub2+sub1;
            if(B.matches(str)){
                return true;
            }
		}
        return false;
    }
}