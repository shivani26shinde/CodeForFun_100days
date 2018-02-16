// Programming Competition Question 1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProgrammingCompetitionOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String printName = "";
        int max = Integer.MIN_VALUE;
        for(int a0 = 0; a0 < n; a0++){
            String name = in.next();
            int d = in.nextInt();
            int j = in.nextInt();
            int diff = j-d;
            if(diff > max){
                max = diff;
                printName = name;
            }
        }
        System.out.println(printName+" "+max);
        in.close();
    }
}
