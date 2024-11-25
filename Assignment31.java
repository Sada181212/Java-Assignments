package javaassignments;

import java.util.Arrays;

public class Assignment31 {

	public static void main(String[] args) {
		// Write an array program to check whether it stores null value or not
		
		int []rollno=new int[2];
		rollno[0]=78;
		System.out.println(Arrays.toString(rollno));// You can't store 'null' in any of primitive types.
		String[]name=new String[2];
		name[0]="ram";
		name[1]=" ";
		System.out.println(Arrays.toString(name));
		

	}

}
