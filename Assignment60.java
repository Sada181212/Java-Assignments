package javaassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment60 {

	public static void main(String[] args) {
		//WAP using Collection methods
		Collection c= new ArrayList();
		c.add(45);
		c.add("Saurabh");
		c.add(165);
		c.add(6.8);
		c.add(true);
		c.add('d');
		System.out.println(c);
		
		Collection c1= new ArrayList();
		c1.addAll(c);
		c1.add(123);
		c.add("sada");
		System.out.println(c1);
		boolean b =c.equals(c1);
		System.out.println(b);
		boolean b1=c.contains("Saurabh");
		System.out.println(b1);
		boolean b3 =c1.containsAll(c1);
		System.out.println(b3);
		
		
				

	}

}
