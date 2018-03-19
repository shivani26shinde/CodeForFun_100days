// Practice Code --> Maximum Frequency Words

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxFreqWords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		int j=0;
		while(sc.hasNext()){
			String st = sc.nextLine();
			set.add(st);
		}
		// Example:
		String str = "jose got the is the jose not the got a of the is and then the of is there on that";
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++){
			if(!set.contains(arr[i])){
				if(map.containsKey(arr[i])){
					int val = map.get(arr[i]);
					map.put(arr[i], val+1);
				}
				else{
					map.put(arr[i], 1);
				}
				max = Math.max(max, map.get(arr[i]));
			}
		}
		for(String s: map.keySet()){
			if(map.get(s) == max){
				System.out.println(s);
			}
		}
	}
}