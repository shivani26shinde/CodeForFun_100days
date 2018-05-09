# Password Cracker

import java.io.*;
import java.util.*;

public class Solution {
    public static String Check(HashSet<String> set, String toBeChecked){
        int j=0;
        ArrayList<String> str = new ArrayList<>();
        for(int i=1;i<=toBeChecked.length();i++){
            String temp = toBeChecked.substring(j,i);
            if(set.contains(temp)){
                str.add(temp);
                j = i;
            }
        }
        if(j != toBeChecked.length()){
            return "WRONG PASSWORD";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.size()-1;i++){
            sb.append(str.get(i));
            sb.append(" ");
        }
        sb.append(str.get(str.size()-1));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            HashSet<String> set = new HashSet<>();
            int N = sc.nextInt();
            for(int j=0;j<N;j++){
                set.add(sc.next());
            }
            String toBeChecked = sc.next();
            String ans = Check(set, toBeChecked);
            System.out.println(ans);
        }
    }
}