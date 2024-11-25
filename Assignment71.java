package javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment71 {

	public static void main(String[] args) {
		/*
		 * WAP using Map that stores the names of fruits and their quantities then
		 * perform actions: i)retrieve & print fruit quantity ii)remove fruit iii)print
		 * all fruits with quantity
		 */
		
		Map<String,Integer> m =new HashMap<String,Integer>();
		m.put("Banana", 24);
		m.put("Graps", 500);
		m.put("Guvava", 12);
		m.put("Mango", 36);
		m.put("Papaya", 48);
		System.out.println("i)retrieve & print fruit quantity");
		System.out.println(m.values());
		System.out.println("---------------------------------");
		System.out.println("ii)remove fruit");
		m.remove("Graps");
		System.out.println(m.values());
		System.out.println("---------------------------------");
		System.out.println("iii)print all fruits with quantity");
		System.out.println(m.entrySet());

	}

}
