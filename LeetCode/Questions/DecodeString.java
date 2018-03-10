// LeetCode --> Q.394 --> Decode String

class DecodeString {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int num = 0;
        while(i<s.length()){
            Stack<Integer> st1 = new Stack<>();
            Queue<Character> q2 = new LinkedList<>();
            if(Character.isDigit(s.charAt(i))){
                st1.add(Character.getNumericValue(s.charAt(i)));
                i++;
            }
            if(s.charAt(i) == '['){
                i++;
                while(s.charAt(i) != ']'){
                    q2.add(s.charAt(i));
                    i++;
                }
                StringBuilder temp = new StringBuilder();
                while(!q2.isEmpty()){
                    temp.append(q2.poll());
                }
                
                if(!st1.isEmpty()){
                    num = st1.pop();
                }
                for(int j=0;j<num;j++){
                    sb.append(temp.toString());
                }
            } 
            i++;
        }
        return sb.toString();
    }
}