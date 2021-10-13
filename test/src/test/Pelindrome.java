package test;

public class Pelindrome {
	
	public static void main(String args[])
	{
		int number= 454;
		int temp= number;
		int newnumber =0;
		int remainder=0;
		
		while(number!=0)
		{
			remainder=number%10;
			newnumber = remainder+(newnumber*10);
			number= number/10;
		}
		System.out.println(newnumber);
		System.out.println(number);
		
		if(temp==newnumber)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

}
