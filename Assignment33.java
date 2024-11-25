package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) {
		// Write a program to accept the array at runtime
		
		Scanner s = new Scanner(System.in);
		int rollno[]=new int[4];
		for(int i=0;i<4;i++)
		{
			rollno[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(rollno));

	}

}
