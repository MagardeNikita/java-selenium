package test1;

import java.util.Arrays;

public class ArrayCopy {

	
	public static void main(String args[])
	{
		int [] array1= {1,2,3,4};
		
		int[] copiedarray= array1;
		int[] copiedarray2=new int[array1.length];
		
		System.out.println(Arrays.toString(copiedarray));
		
		//by using for loop
		
		for (int i : array1) {   //can not copy values using for each loop
			System.out.println(i);
			
		}
		for (int i = 0; i < copiedarray2.length; i++) {
			copiedarray2[i]=array1[i];
		}
		System.out.println(Arrays.toString(copiedarray2));
	}
}
