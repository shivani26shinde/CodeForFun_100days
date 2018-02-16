// Programming Competition Question 2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProgrammingCompetitionTwo {

    static long winningLotteryTicket(String[] tickets) {
        long count = 0;
        for(int i=0;i<tickets.length-1;i++){
            for(int j=i+1;j<tickets.length;j++){
                HashSet<Character> set = new HashSet<>();
                String combo = tickets[i] + tickets[j];
                char[] chr = combo.toCharArray();
                for(char c: chr){
                    set.add(c);
                }
                if(set.size() == 10){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for(int tickets_i = 0; tickets_i < n; tickets_i++){
            tickets[tickets_i] = in.next();
        }
        long result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }
}
