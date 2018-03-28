// LeetCode --> Q.476 --> Number Complement

class NumberComplement {
    public int findComplement(int num) {
        int start = 0;
        int sum = 0;
        while(num != 0){
            int val = num%2;
            if(val == 1){
                val = 0;
            }
            else{
                val = 1;
            }
            sum = sum + (int)Math.pow(2,start) * val;
            start++;
            num = num/2;
        }
        return sum;
    }
}