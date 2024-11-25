package javaassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment69 {

	public static void main(String[] args) {
		// WAP using the Map interface and iterate over its entries using an Iterator with a while loop.
		
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Sada", 12345);
		m1.put("Alok", 2145);
		m1.put("Karan", 3256);
		m1.put("Gauri", 7854);
		m1.put("Anant", 9654);
		
		Iterator<Entry<String,Integer>>  i1=          m1.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
