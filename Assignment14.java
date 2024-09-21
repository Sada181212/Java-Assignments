package javaassignments;

import java.util.Scanner;

public class Assignment14 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number from 1 to 7: ");
	int i= sc.nextInt();
		switch(i)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thusrday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("you have choosen diffrent number rather than 1 to 7 hence you gate terminated");
				
		
		}
	sc.close();
	}
}
