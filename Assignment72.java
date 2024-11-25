package javaassignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment72 {

	public static void main(String[] args) {
		/*
		 * WAP using Map to store student roll numbers and their names then perform
		 * actions: i)Check if specific roll no and name exist in map & print if exists
		 */
		
		Map <String, Integer>m =new HashMap<String, Integer>();
		m.put("Krishna", 1);
		m.put("Sadanand", 11);
		m.put("Gauravi", 12);
		m.put("Swati", 14);
		for (Entry <String,Integer> i:   m.entrySet())
		{
			if(i.getValue().equals(14))
			{
				System.out.println(i);
			}
		}
	}

}
