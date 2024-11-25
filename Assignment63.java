package javaassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment63 {

	public static void main(String[] args) {
		// PLease use backward iteration using listiterator for arraylist without
		// farward iteration and note down the error
		List li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(100);
		li.add(500);
		li.add(60);
		li.add(50);
		li.add(30);
		li.add(40);
		ListIterator l1 = li.listIterator();

		 System.out.println("Backward list iterator will not work without forward list of itreation");
		 
		while (l1.hasPrevious()) {
			System.out.println(l1.previous());
		}

	}

}
