package test;

import java.util.Arrays;

public class Anagram {
	
	
	public static void main(String[] args)
	{
		String s1= "peek a keep";
		String s2= "keep a peek";
		//String s2= "kee a peek";
		
		String s3= s1.replaceAll("//s", " ");
		String s4= s2.replaceAll("//s", " ");
		
		System.out.println(s3);
		System.out.println(s4);
		char[] c1 = s3.toLowerCase().toCharArray();
		 System.out.println(c1);
		 System.out.println(Arrays.toString(c1));
		 
		 char[] c2= s4.toLowerCase().toCharArray();
		 System.out.println(c2);
		 
		 Arrays.sort(c2);
		 Arrays.sort(c1);
		 
		// String str1= String.valueOf(c1);
		// String str2 = String.valueOf(c2);
		  System.out.println(Arrays.equals(c1, c2));
		 //System.out.println(str1.contains(str2));
		  
		  System.out.println(c1);
			System.out.println(c2);
			
			String[] Arraystring= {"nikita", "magarde"};
			System.out.println(Arrays.toString(Arraystring));
			System.out.println(Arraystring);
		 
	}

}
