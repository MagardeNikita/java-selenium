package test;

public class FrequencyOfArrayElements {
	
	
	static int a= 1;
	int b=2;
	
	public static void main(String args[])
	{
		int[] arr= {1, 2, 3, 1, 2, 3, 4};
		
		int[] countarr = new int[arr.length];
		
		int visited = -1;
		System.out.println("nikita"+a);
		//System.out.println("nikita"+b);
		
		for(int i= 0; i<arr.length;i++)
		{
			int count =1;
			for(int j=i+1; j<arr.length;j++)
			{
				if (arr[i]==arr[j])
                  {
                	  count++;
                	  countarr[j]=visited;
	
                  }
			}
			if (countarr[i]!=visited)
					{
				countarr[i]= count;
					}
		
		}
		
		for( int k= 0; k<arr.length;k++)
		{
			if(countarr[k]!=visited)
			{
				System.out.println(arr[k]+" frequency is "+countarr[k]);
			}
		}
		
	}
	public void display()
	{
		System.out.println("nikita"+b);
	}

}
