package javaassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Assignment64 {

	public static void main(String[] args) {
		// WAP using Iterator(process of iteration through iterable )
		
		List li= new ArrayList();
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(100);
		li.add(500);
		li.add(60);
		li.add(50);
		li.add(30);
		li.add(40);
		//li.add("");
		Collections.sort(li);
		//System.out.println(li);
		Iterator i1 = li.iterator();
		while (i1.hasNext())
		{
		System.out.println(i1.next());
		}
		

	}

}
