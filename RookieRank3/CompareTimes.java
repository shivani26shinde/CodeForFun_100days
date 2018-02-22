// Rookie Rank 3 - Question 2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTimes {

    static String timeCompare(String t1, String t2){
        String sub1 = t1.substring(5);
        String sub2 = t2.substring(5);
        if(sub1.equals("AM") && sub2.equals("PM")){
            return "First";
        }
        else if(sub1.equals("PM") && sub2.equals("AM")){
            return "Second";
        }
        else{
            int num1Part1 = Integer.parseInt(t1.substring(0,2));
            int num2Part1 = Integer.parseInt(t2.substring(0,2));
            if(num1Part1 < num2Part1){
                return "First";
            }
            else if(num1Part1 > num2Part1){
                return "Second";
            }
            else{
                int num1Part2 = Integer.parseInt(t1.substring(3,5));
                int num2Part2 = Integer.parseInt(t2.substring(3,5));
                if(num1Part2 < num2Part2){
                    return "First";
                }
                else if(num1Part2 > num2Part2){
                    return "Second";
                }
            }
        }
        return "";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String t1 = in.next();
            String t2 = in.next();
            String result = timeCompare(t1, t2);
            System.out.println(result);
        }
    }
}
