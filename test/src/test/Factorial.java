package test;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args)
	{
		
		System.out.println("enter number to calculate factorial");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		
		int fact=1;
		
		for(int i=number; i>1; i--)
		{
			fact= fact*i;
		}
		System.out.println(fact);
	}

}
