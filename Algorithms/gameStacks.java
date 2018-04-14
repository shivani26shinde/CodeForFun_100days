# Game of two stacks

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            int sum = 0;
            int move = 0;
            int p1 = 0;
            int p2 = 0;
            while(sum <= x){
                if(p1 != n && p2 != m){
                    if(a[p1] <= b[p2]){
                        sum = sum + a[p1];
                        move++;
                        p1++;
                    }
                    else{
                        sum = sum + b[p2];
                        move++;
                        p2++;
                    }
                }
                else{
                    if(p1 == n && p2 != m){
                        sum = sum + b[p2];
                        move++;
                        p2++;
                    }
                    else if(p2 == m && p1 != n){
                        sum = sum + a[p1];
                        move++;
                        p1++;
                    }
                    else{
                        move++;
                        break;
                    }
                }              
            }
            System.out.println(move-1);
        }
    }
}
