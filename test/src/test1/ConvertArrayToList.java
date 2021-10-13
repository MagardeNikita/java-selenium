package test1;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

	
	public static void main(String args[])
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(12);
		list.add(24);
	//	list.add(null);
		
		//method 1
		Integer  A2[] = list.toArray(new Integer[list.size()]);
		
		for(int a:A2) {
			System.out.println(a);
		}
		
		//method 2
		Integer A4[]= new Integer[list.size()];
		list.toArray(A4);
		
		
		//Array to list
		Arrays.asList(A2);
		
		
		ArrayList<Integer> A3= new ArrayList<Integer>(Arrays.asList(A2));
		
		for(Integer a: A3)
		{
			System.out.println(a);
		}
	}
	
	
}
