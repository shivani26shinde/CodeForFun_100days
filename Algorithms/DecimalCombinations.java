// Decimal Combinations

import java.util.*;
import java.lang.*;
import java.io.*;

class DecimalCombinations
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "1234";
		Combo(s,0,"","",s.length());
	}
	public static void Combo(String s, int start, String a, String b, int n){
		if(a.length()>0 && b.length()>0 && a.length()+b.length() == n){
			System.out.println(a+"  "+b);
			DotComboA(0,a,b,a.length());
			DotComboB(0,a,b,b.length());
			return;
		}
		for(int i=start;i<n;i++){
			a = s.substring(0,i+1);
			b = s.substring(i+1,n);
			Combo(s,i+1,a,b,n);
		}
	}
	public static void DotComboA(int start, String a, String b, int n){
		if(a.length() > n){
			System.out.println(a+"  "+b);
			return;
		}
		for(int i=start;i<n-1;i++){
			String tempA = a.substring(0,i+1)+"."+a.substring(i+1,n);
			DotComboA(i+1,tempA,b,n);
		}
	}
	public static void DotComboB(int start, String a, String b, int n){
		if(b.length() > n){
			System.out.println(a+"  "+b);
			return;
		}
		for(int i=start;i<n-1;i++){
			String tempB = b.substring(0,i+1)+"."+b.substring(i+1,n);
			DotComboB(i+1,a,tempB,n);
		}
	}
}