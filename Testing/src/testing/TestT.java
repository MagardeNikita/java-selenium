package testing;

public class TestT {
	
	public static void main(String [] args)
	{
		
	
		String s= "abacdef";
		int count;
		char visited= '0';
		char c[]= s.toCharArray();
		
		int charcount[] = new int[c.length];
		
		
		
		for (int i = 0; i < c.length; i++) {
			
			count=1;
			
			for (int j = i+1; j < c.length; j++) {
				
				if(c[i]==c[j])
				{
					count++;
					c[j]=visited;
					
				}				
			}
			
			if(c[i]!=visited)
			{
				charcount[i]=count;
			}
			
		}
		
		for (int i = 0; i < charcount.length; i++) {
		if(c[i]!=visited && charcount[i]==1)
		{
			System.out.println(c[i]);
		}
			
		}
		
		
		
		
	}

}
