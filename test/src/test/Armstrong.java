package test;

public class Armstrong {

	
	public static void main (String args[])
	{
		int number = 153; int temp=number;
		
		int newnumber=0; int remainder=0;
		
		while(number!=0)
		{
			remainder= number%10;
			newnumber = newnumber+(remainder*remainder*remainder);
			number= number/10;
			
		}
		System.out.println(temp);
		System.out.println(number);
		System.out.println(newnumber);
		
		if(temp==newnumber)
		{
			System.out.println("armstrong true");
		}
	}
}
