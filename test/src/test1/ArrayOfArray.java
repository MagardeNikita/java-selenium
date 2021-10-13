package test1;

import java.util.Arrays;

public class ArrayOfArray {
	
	public static void main(String args[])
	{
		int[][] array= new int[2][2];
		
		array[0][0]= 2;
		array[0][1]= 3;
		array[1][0]= 2;
		array[1][1]= 2;
		
		for (int[] n : array) {
			for (int data : n) {
				System.out.println(data);
			}
			
		}
		
		System.out.println(Arrays.deepToString(array));
		
		int[][] array2= {{1,2}, {3,4}, {6,7,8,9}};
		
		for(int[] a: array2) {
			for(int data:a)
			{
				System.out.println(data);
			}
			
		}
		
		System.out.println(Arrays.deepToString(array2));
		
		
		
	}

}
