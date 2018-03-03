// LeetCode --> Weekly Contest 65 --> Question 1 --> Reach Number

class ReachNumber {
    public int reachNumber(int target) {
        return CountNum(0,target,0);
    }
    public int CountNum(int current, int target, int start){
        if(Math.abs(current) > (target)){
            return Integer.MAX_VALUE;
        } 
        if(current == target){
            return start;
        }
        int right = CountNum(current+start+1, target, start+1);
        int left = CountNum(current-start-1, target, start+1);
            
        return Math.min(right,left);
    }
}