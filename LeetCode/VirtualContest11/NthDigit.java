// LeetCode --> Q.400 --> Nth Digit 

class NthDigit {
    public int findNthDigit(int n) {
        if(n == 0){
            return 0;
        }
       StringBuilder sb = new StringBuilder();
        int i=1;
        while(sb.length() < n){
            sb.append(i);
            i++;
        }
        char c = sb.toString().charAt(n-1);
        int ans = Character.getNumericValue(c);
        return ans;
    }
}