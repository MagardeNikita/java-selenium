package test;

public class PalindromeString {
	
	 	
	public static void main(String args[]){
		
		String s2="Lool";
		String s1=s2.toLowerCase();
		String reverse="";
		
		int length = s1.length();
		System.out.println(length);
		
		for(int i=(length-1);i>=0; i-- )
		{
			reverse= reverse+s1.charAt(i);
			
		}		
		if(s1.equals(reverse))
		{
			System.out.println(true);
		}
		
	}

}
