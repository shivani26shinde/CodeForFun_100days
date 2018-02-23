// Algorithm

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinLoss {

    static int minimumLoss(long[] price) {
        long[] ret = new long[price.length];
        ret[0] = price[0];
        long min = (long) Integer.MAX_VALUE;
        for(int i=0;i<price.length-1;i++){
            for(int j=i+1;j<price.length;j++){
                if(price[i]<price[j]){
                    min = Math.min(price[j], min);
                    ret[j] = min;
                }
                else{
                    min = Math.min(price[i]-price[j], min);
                    ret[j] = min;
                }
            }
        }
        return (int) min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] price = new long[n];
        for(int price_i = 0; price_i < n; price_i++){
            price[price_i] = in.nextLong();
        }
        int result = minimumLoss(price);
        System.out.println(result);
        in.close();
    }
}
