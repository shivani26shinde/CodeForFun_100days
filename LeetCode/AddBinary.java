// LeetCode --> Q.67 --> Add Binary

class AddBinary {
    public String addBinary(String a, String b) {
        int num = 0;
        int start1 = 0;
        int start2 = 0;
        StringBuilder sb = new StringBuilder();
        while(start1 < a.length() || start2 < b.length()){
            int val1 = Character.getNumericValue(a.charAt(start1)); 
            int val2 = Character.getNumericValue(b.charAt(start2));
            int sum = num+val1+val2;
        }
        return sb.toString();
    }
}