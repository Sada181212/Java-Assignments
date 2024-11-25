package javaassignments;

import java.util.Arrays;

public class Assignment28 {

	public static void main(String[] args) {
		// Write a program where you get Negative Array size exception.
		
		int [] rollno = new int[-2];
		rollno[0]=1;
		rollno[1]=2;
		System.out.println(Arrays.toString(rollno));
		

	}

}
