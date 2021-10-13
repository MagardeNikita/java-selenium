package test1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {	
	
	public static void main(String args[])
	{
		
		HashMap<Integer,String> h= new HashMap<>();
		
		h.put(1, "nikita");
		h.put(2, "mohnish");
		
		h.put(null, null);
		
		for(Integer I:h.keySet())
		{
			System.out.println(I);
	
		}
		for(String s:h.values())
		{
			System.out.println(s);
		}
		
		
		for(Map.Entry<Integer, String> entry: h.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
