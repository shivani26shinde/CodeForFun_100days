# Pattern a^ib^jc^k

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Count(String s){
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'a'){
				a = 1+2*a;
			}
			else if(s.charAt(i) == 'b'){
				b = a+2*b;
			}
			else{
				c = b+2*c;
			}
		}
		return c;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Count("abcabc"));
	}
}