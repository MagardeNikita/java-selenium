package test1;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateThroughArray {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		ArrayList<Integer> A1 = new ArrayList<>();
		
		A1.add(41);
		A1.add(42);
		A1.add(1, 43);
	
		System.out.println("Array size is "+A1.size());
		
		Iterator<Integer> i = A1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		A1.clear();
		A1.add(55);
		System.out.println("Array size is "+A1.size());
     Iterator<Integer> i1 = A1.iterator();
     while(i1.hasNext()) 
      { 
    	  System.out.println(i1.next()); 
     }
     
     A1.add(56);
     
     for(Integer num:A1)
     {
    	 System.out.println("printing with for each "+num);
     }
     
    ArrayList<Integer> A2= (ArrayList<Integer>) A1.clone();
     
    for(Integer num:A2)
    {
   	 System.out.println("printing with for each A2 after cloning"+num);
    }
    System.out.println(A1.contains(A2));
    System.out.println(A1.get(0));    
    System.out.println(A1.getClass());
    System.out.println(A1.hashCode());
   
    
      }
	

	

}
