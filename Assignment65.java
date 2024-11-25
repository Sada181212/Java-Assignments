package javaassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment65 {

	public static void main(String[] args) {
		//WAP using ListIterator
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
		ListIterator l1 =li.listIterator();
		System.out.println("Foraward list iterator");
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		System.out.println("Backward list iterator");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}

}
