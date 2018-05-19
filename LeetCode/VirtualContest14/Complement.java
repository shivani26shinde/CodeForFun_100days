// LeetCode --> Q.476 --> Complement

class Complement {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        int val = 0;
        while(num != 0){
            val = num%2;
            sb.append(val);
            num = num/2;
        }
        String s = sb.toString();
        int sum = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            val = Character.getNumericValue(s.charAt(i));
            if(val == 0){
                sum = sum + (int) ( Math.pow(2, count) * 1 );
            }
            else{
                sum = sum + (int) ( Math.pow(2, count) * 0 );
            }
            count++;
        }
        return sum;
    }
}