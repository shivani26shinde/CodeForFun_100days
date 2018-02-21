// Programming Competition Question 3

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimplestSum {
    
    static int secondVal = 0;
    static int simplestSum(int k, int a, int b) {
        int sum = 0;
        sum = Sum(k, a, b);
        return sum;
    }
    static int Sum(int k, int a, int b){
        int sum = 0;
        for(int i=a;i<=b;i++){
            int sumT = Calculation(k,i);
            sum = sum+sumT;
            for(int j=i+1;j<=secondVal;j++){
                if(j<=b){
                    sum = sum+sumT;
                    i=j;
                }
                else{
                    break;
                }
            }
        }
        sum = sum%( (int) Math.pow(10,9) + 7);
        return sum;
    }
    
    static int Calculation(int k, int n){
        int sum = 0;
        secondVal = 0;
        for(int i=1;i<=n;i+=1){
            sum = sum+i;
            i=i*k;
            secondVal = i;
        }        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int k = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int result = simplestSum(k, a, b);
            System.out.println(result);
        }
        in.close();
    }
}
