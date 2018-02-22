// Rookie Rank 3

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindTheBug {

    static int[] findTheBug(String[] grid){
        int[] val = new int[2];
        for(int i=0;i<grid.length;i++){
            String temp = grid[i];
            for(int j=0;j<temp.length();j++){
                if(Character.toString(temp.charAt(j)).matches("[X]")){
                    val[0] = i;
                    val[1] = j;
                    return val;
                }
            }
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        // Return an array containing [r, c]
        int[] result = findTheBug(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
        }
        System.out.println("");
        

    }
}
