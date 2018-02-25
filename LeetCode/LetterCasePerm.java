// LeetCode : Letter Case Permutation

class LetterCasePerm {
    static List<String> l1 = new ArrayList<String>();
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        makePermutations(S,0, "");
        for(int i=0;i<l1.size();i++){
            if(!list.contains(l1.get(i))){
                list.add(l1.get(i));
            }
        }
        return list;
    }
    public static void makePermutations(String s, int start,String sub){
        if(sub.length() == s.length()){
            l1.add(sub);
            return;
        }
        for(int i=start;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sub = sub+Character.toLowerCase(s.charAt(i));
                makePermutations(s,i+1,sub);    
                sub = sub.substring(0, sub.length() - 1);
                sub = sub+Character.toUpperCase(s.charAt(i));
                makePermutations(s,i+1,sub);
            }
            else{
                String temp = sub+s.charAt(i);
                makePermutations(s,i+1,temp);
            }
        }
    }
}