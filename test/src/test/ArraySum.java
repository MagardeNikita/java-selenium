package test;

import java.util.Arrays;

public class ArraySum {
	
	public static void main(String args[])
	
	{
		int[] Array = new int[5];
		Array[0] = 5;
		Array[1] = 1;
		Array[2] = 7;
		Array[3] = 15;
		Array[4] = 2;
		
		Arrays.sort(Array);
		System.out.println(Array);
		
		int length = Array.length;
		
		int sum = Array[length-1]+ Array[length-2];
		System.out.println(sum);
	}

}
