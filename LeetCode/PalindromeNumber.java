// Leetcode --> Q.9 --> Palindrome Number

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;
        while(temp != 0){
            int mod = temp%10;
            sum = sum*10 + mod;
            temp = temp/10;
        }
        if(x<0){
            if(x == -sum){
                return true;
            }
            else{
                return false;
            }
        }
        if(x == sum){
            return true;
        }
        return false;
    }
}