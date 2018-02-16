// Weeks of Code 36 -- Revised Russian Roulette

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RevisedRussianRoulette {

    static int[] revisedRussianRoulette(int[] doors) {
        int count1 = 0;
        int count2 = 0;
        int start = 0;
        for(int i=0;i<doors.length;i++){
            if(doors[i] == 1){
                count2++;
            }
        }
        while(start<doors.length){
            if(doors[start] != 0){
                count1++;
                start++;
            }
            start++;
        }
        int[] returnValue = new int[2];
        returnValue[0] = count1;
        returnValue[1] = count2;
        return returnValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
