package javaassignments;

import java.util.Scanner;

public class Assignment58 {

	public static void main(String[] args) {
		//WAP to perform  switch case
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter 1 for chrome: ");
		System.out.println("Please enter 2 for firefox: ");
		System.out.println("Please enter 3 foredge : ");
		System.out.println("Please enter 4 for safari: ");
		int input=s.nextInt();
		switch(input)
		{
			case 1: System.out.println("Launching chrome browser");
					break;
			case 2: System.out.println("Launching firfox browser");
					break;
			case 3: System.out.println("Launching edge browser");
					break;
			case 4: System.out.println("Launching safari browser");
					break;
			default:
				System.out.println("Your selection is worng can you please tryagain?");
		}

	}

}
