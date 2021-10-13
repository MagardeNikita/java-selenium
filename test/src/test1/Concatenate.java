package test1;

import java.util.Arrays;

public class Concatenate {
	
	public static void main(String args[])
	{
		int[] array1 = {1,2,3};
		int[] array2= {4,5,6};
		
		int[] result= new int[(array1.length)+(array2.length)];
		
		System.arraycopy(array1, 0, result, 0, array1.length);
		System.arraycopy(array2, 0, result, array1.length, array2.length);
		
		System.out.println(Arrays.toString(result));
		
		//without using arraycopy
		
		int[] result2= new int[(array1.length)+(array2.length)];
		int index=0;
		for(int i=0;i<array1.length;i++)
		{
			result2[i]=array1[i];
			index++;
		}
		for(int i=0;i<array2.length;i++)
		{
			result2[index]=array2[i];
			index++;
			
		}
		
		System.out.println(Arrays.toString(result2));
		
	}

}
