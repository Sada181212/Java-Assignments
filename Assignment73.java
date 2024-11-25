package javaassignments;

import java.util.Scanner;

public class Assignment73 {

	public static void main(String[] args) throws NegativeArraySizeException {
		//Wap to handle the exception using try and multiple  catch methods
		try {
			Scanner s =new Scanner(System.in);
			int size =s.nextInt();
			int []rollno=new int[size];
			rollno[0]=1;
			rollno[1]=2;
			rollno[2]=3;
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ENter Proper size");
			Scanner s =new Scanner(System.in);
			int size =s.nextInt();
			int []rollno=new int[size];
		}
	}
}
