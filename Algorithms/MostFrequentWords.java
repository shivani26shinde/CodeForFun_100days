// Most Frequent Words 

import java.util.*;
import java.lang.*;
import java.io.*;

class MostFrequentWords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "This is's jacks's has his Jacks in's his Cheese his cheese";
		s = s.toLowerCase();
		String[] arr = s.split("[\\p{Punct}\\s]+");
		HashSet<String> set = new HashSet<>();
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> wordsToExclude = new ArrayList<>();
		int max = 0;
		for(int i=0;i<wordsToExclude.size();i++){
			set.add(wordsToExclude.get(i));
		}
		for(int i=0;i<arr.length;i++){
			String temp = arr[i];
			if(!set.contains(temp)){
				if(map.containsKey(temp)){
					int val = map.get(temp);
					map.put(temp, val+1);
				}
				else{
					map.put(temp, 1);
				}
				max = Math.max(max, map.get(temp));
			}
		}
		ArrayList<String> list = new ArrayList<>();
		for(String st: map.keySet()){
			if(map.get(st) == max){
				list.add(st);
			}
		}
		return list;
		
	}
}