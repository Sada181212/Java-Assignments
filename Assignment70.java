package javaassignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment70 {

	public static void main(String[] args) {
		// WAP using the Map interface and iterate over its entries usng for loop 
		
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Sada", 12345);
		m1.put("Alok", 2145);
		m1.put("Karan", 3256);
		m1.put("Gauri", 7854);
		m1.put("Anant", 9654);
		
		m1.entrySet();
		//System.out.println(m1);
		
		
	for(Entry<String,Integer> i2: m1.entrySet())
	{
		System.out.println(i2);
	}

	}

}

