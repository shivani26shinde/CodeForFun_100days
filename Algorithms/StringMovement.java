// String Movement

import java.util.*;
import java.lang.*;
import java.io.*;

class StringMovement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "abc";
		String[] operations = new String[3];
		operations[0] = "0 0 L";
		operations[1] = "2 2 L";
		operations[2] = "0 2 R";
		for(int i=0;i<operations.length;i++){
		            String[] str = operations[i].split(" ");
		            int start = Integer.parseInt(str[0]);
		            int end = Integer.parseInt(str[1]);
		            char c = str[2].charAt(0);
		            int num = 1;
		            if(c == 'L'){
		                num = -1;
		            }
		            String temp = s;
		            StringBuilder sb = new StringBuilder();
		            for(int j=start;j<=end;j++){
		                char chr = s.charAt(j);
		                if(c == 'L' && chr == 'a'){
		                    sb.append('z');
		                }
		                else if(c == 'R' && chr == 'z'){
		                    sb.append('a');
		                }
		                else{
		                    char val = (char)(chr + num);
		                    sb.append(val);
		                }
		            }
	            	s = temp.substring(0,start) + sb.toString() + temp.substring(end+1,s.length());
		}
    		System.out.println(s);
	}
}