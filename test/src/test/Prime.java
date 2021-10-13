package test;

public class Prime {

	public static void main(String[] args)
	{
		int number=21;
		
		int loop= number/2;
		int flag=0;
		
		if(number==0||number==1)
		{
			System.out.println("number is not prime");
		}
		
		for(int i=2; i<=loop; i++)
			
		{
			if((number%i)==0)
			{
				System.out.println("number is not prime");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("prime number");
		}
	}
}
