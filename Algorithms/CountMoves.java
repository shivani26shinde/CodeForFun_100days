// Count Moves

import java.util.*;
import java.lang.*;
import java.io.*;

class CountMoves
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] numbers = {3,4,6,6,3};
		int count = 0;
		if(numbers.length == 0){
			System.out.println(count);
		}
		else{
			Arrays.sort(numbers);
			int min = numbers[0];
			int max = numbers[numbers.length-1];
			while(min != max){
				for(int i=0;i<numbers.length-1;i++){
				    numbers[i] = numbers[i]+1;
				}
				Arrays.sort(numbers);
				min = numbers[0];
				max = numbers[numbers.length-1];
				count++;
			}
		}
		System.out.println(count);
	}
}