package test;



public class DuplicatesandFrequency {
	
	public static void main(String args[])
	{
		int[] arr= {1,2,3,3,1,3,4,5};
		int[] arrcount = new int[arr.length];
		int visited =-1;
		int count;
		
		 for (int i = 0; i < arr.length; i++) {
			 count =1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=visited;
				}				
			}
			if(arr[i]!=visited)
			{
				arrcount[i]=count;
			}	
			
		}
		 
		 System.out.println("frequency");
		 for (int i = 0; i < arr.length; i++) {
			
			 if(arr[i]!=visited)
				{
					System.out.println(arr[i]+"------------"+arrcount[i]);
				}
		}
		 System.out.println("only duplicates");
		 for (int i = 0; i < arr.length; i++) {
			
			 if(arr[i]!=visited&&arrcount[i]>1)
				{
					System.out.println(arr[i]+"------------"+arrcount[i]);
				}
		}
		 
		 
		 String s= "malayalam";
		 char[] sarray =s.toCharArray();
		 int count1;
		 char visited1='0';
		 int srrcount1[]= new int[s.length()];
		
		 for (int i = 0; i < sarray.length; i++) {
			 count1=1;
			for (int j = i+1; j < sarray.length; j++) {
				
				if(sarray[i]==sarray[j])
				{
					count1++;
					sarray[j]= visited1;
				}
				
			}
			if(sarray[i]!=visited1)
			{
				srrcount1[i]=count1;
			}
			
		}
		 System.out.println("frequency");
		 for (int i = 0; i < sarray.length; i++) {
			if(sarray[i]!=visited1)
			{
				System.out.println(sarray[i]+"-----------"+srrcount1[i]);
			}
			
		}
		 
		 System.out.println("only duplicates");
		 for (int i = 0; i < sarray.length; i++) {
			if(sarray[i]!=visited1&&srrcount1[i]>1)
			{
				System.out.println(sarray[i]+"-----------"+srrcount1[i]);
			}
			
		} 
		 
		 
		
	}
	
	
	
	

}
