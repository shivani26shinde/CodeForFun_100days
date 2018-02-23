// Algorithms --> Implementation

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {
    
    static Set<Integer> set = new HashSet<Integer>();
   
    static int[] solve(int[] grades){
        int[] ret = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            if(grades[i] < 38){
                ret[i] = grades[i];
            }
            else{
                int val = grades[i]%10;
                if(!set.contains(val)){
                    ret[i] = grades[i];
                }
                else{
                    if(val<5){
                        ret[i] = grades[i]+(5-val);
                    }
                    else{
                        ret[i] = grades[i]+(10-val);
                    }
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        set.add(3);
        set.add(4);
        set.add(8);
        set.add(9);
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
