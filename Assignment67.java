package javaassignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Assignment67 {

	public static void main(String[] args) {
		// WAP to utilize add method from Set Interface
		
		Set s1 =new HashSet();
		s1.add(65);
		s1.add(66);
		s1.add(67);
		s1.add(68);
		s1.add(77);
		s1.add(55);
		s1.add("mkt");
		s1.add('x');
		System.out.println(s1);
		
		Iterator i1= s1.iterator();
		
		System.out.println("Forward iteration only dute iteratior");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
