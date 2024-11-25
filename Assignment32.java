package javaassignments;

import java.util.Arrays;

public class Assignment32 {

	public static void main(String[] args) {
		// Write a program to check whether the two given arrays are equal or not.
		int no1[]=new int[4];
		 no1[0]=78;
		 no1[1]=72;
		 no1[2]=75;
		 no1[3]=80;
		 
		 int no2[]=new int[4];
		 no2[0]=78;
		 no2[1]=72;
		 no2[2]=75;
		 no2[3]=80;
		boolean b1= Arrays.equals(no1, no2);
		if(b1==true)
		{
			System.out.println("no1 and no2 are equals to each other ");
		}
		else
		{
			System.out.println("no1 and no2 are not equals to each other ");
		}
	}

}
