package javaassignments;

import java.util.HashSet;
import java.util.Set;

public class Assinment67 {

	public static void main(String[] args) {
		// WAP to utilize add method from Set Interface
		
		Set s1= new HashSet();
		s1.add(67);
		s1.add(67);
		s1.add(null);
		s1.add(null);
		s1.add("Anant");
		s1.add("Gauravi");
		
		System.out.println(s1);
		

	}

}
