package test1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSorting {
	
	public static void main(String args[])
	{
		Map<String, Integer> map = new HashMap();
		map.put("one", 1);
		map.put("two", 2);
		map.put("four", 4);
		map.put("three", 3);
		
		List <Entry<String,Integer>> list = new LinkedList(map.entrySet());
		
		Collections.sort(list, new Comparator<Entry<String,Integer>>()
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		
		});
		
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry);
			
		}
	}

}
