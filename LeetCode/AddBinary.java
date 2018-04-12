// LeetCode --> Q.67 --> Add Binary

class AddBinary {
    public String addBinary(String a, String b) {
        int num = 0;
        int start1 = a.length()-1;
        int start2 = b.length()-1;
        int val1 = 0;
        int val2 = 0;
        StringBuilder sb = new StringBuilder();
        while(start1 >= 0 || start2 >= 0){
            if(start1 >= 0){
                val1 = Character.getNumericValue(a.charAt(start1));
                start1--;
            }
            else{
                val1 = 0;
            }
            if(start2 >= 0){
                val2 = Character.getNumericValue(b.charAt(start2));
                start2--;
            }
            else{
                val2 = 0;
            }
            int sum = (num+val1+val2)%2;
            sb.append(sum);
            num = (num+val1+val2)/2;
        }
        if(num > 0){
            sb.append(num);
        }
        return sb.reverse().toString();
    }
}