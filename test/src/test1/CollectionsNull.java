package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsNull {
	
	public static void main(String args[])
	{
		ArrayList al= new ArrayList();
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(null);
		al.add(null);
		
		System.out.println("ArrayList------duplicates are allowed also preserves adding order----multiple nulls are allowed"+al);
		System.out.println();
		
		LinkedList ll = new LinkedList();
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(null);
		ll.add(null);
		System.out.println("LinkedList-------duplicates are allowed also preserves adding order-----multiple nulls is allowed"+ll);
		System.out.println();
		
		Stack s= new Stack();
		s.add(2);
	    s.add(2);
		s.add(3);
		s.add(null);
		s.add(null);
		System.out.println("Stack-------duplicates are allowed also preserves adding order-----multiple nulls are allowed"+s);
		System.out.println();
		
		HashSet hs= new HashSet();
		hs.add(2);
	    hs.add(2);
		hs.add(3);
		hs.add(null);
		hs.add(null);
		System.out.println("HashSet-------no order----no duplicates allowed--- 1 null is allowed-"+hs);
		System.out.println();
		
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add(2);
	    lhs.add(2);
		lhs.add(3);
		lhs.add(null);
		lhs.add(null);
		System.out.println("LinkedHashSet- no duplicates----elements stored as per insertion order-- 1 null is allowed------"+lhs);
		System.out.println();
		
		TreeSet ts= new TreeSet();
		ts.add(2);
		ts.add(2);
		ts.add(3);
//		ts.add(null); //null pointer exception
//		ts.add(null);
		System.out.println("TreeSet-no duplicates----elements are sorted---- NPE for null with int data typer--homogeneous data------"+ts);
		System.out.println();
		

//		TreeSet t= new TreeSet();
//		t.add(null);
//		System.out.println("TreeSet-only 1 null is allowed and it willhold only one element only - homogeneous data---------"+t);
//		
		
		HashMap m= new HashMap();
		m.put(7, "hello");
		m.put(6, "java");
		System.out.println("HasMap----no storing order----"+m);
		m.put(7, "bye");
		m.put(1, "Magarde");
		System.out.println("HasMap----if try to insert duplicate key the latest one will be stored with value----"+m);
		m.put(2, "Magarde");
		m.put(3, "Magarde");
		System.out.println("HasMap----duplicate values are allowed----"+m);
		m.put(null, "abc");
		System.out.println("HasMap----null key is allowed----"+m);
		m.put(null, "xyz");
		System.out.println("HasMap----null key is allowed but only once latest one will be stored----"+m);
		m.put(4, "null");
		m.put(5, "null");
		System.out.println("HasMap----null values are allowed and multiple times----"+m);
		System.out.println();
		
		
		LinkedHashMap hm= new LinkedHashMap();
		hm.put(7, "bye");
		hm.put(6, "java");
		hm.put(1, "hello");
		hm.put(2, "javaaaaaa");
		hm.put(4, "middle");
		hm.put(5, "javaaa");
		System.out.println("LinkedHashMap----preserves storing order----"+hm);
		System.out.println("LinkedHashMap----other behaviour are same as HashSet----"+hm);
		System.out.println();
//		hm.put(7, "bye");
//		hm.put(1, "Magarde");
//		System.out.println("LinkedHashMap----if try to insert duplicate key the latest one will be stored with value----"+hm);
//		hm.put(2, "Magarde");
//		hm.put(3, "Magarde");
//		System.out.println("LinkedHashMap----duplicate values are allowed----"+hm);
//		hm.put(null, "abc");
//		System.out.println("LinkedHashMap----null key is allowed----"+hm);
//		hm.put(null, "xyz");
//		System.out.println("LinkedHashMap----null key is allowed but only once latest one will be stored----"+hm);
//		hm.put(4, "null");
//		hm.put(5, "null");
//		System.out.println("LinkedHashMap----null values are allowed and multiple times----"+hm);
//		
		TreeMap tm= new TreeMap();
//		tm.put(null, null);
		tm.put(7, "hello");
		tm.put(6, "java");
		tm.put(1, "bye");
		tm.put(2, "javaa");
		tm.put(4, "middle");
		tm.put(5, "javaaaa");
		System.out.println("TreeMap------stores after sorting---can not store null--homogeneous data only"+tm);
		
		
		
	}

}
