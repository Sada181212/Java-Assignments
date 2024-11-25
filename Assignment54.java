package javaassignments;

import basicprogram.AccessSpecifierForMethodWithInTheClass;

public class Assignment54 {
	public void add()
	{
		System.out.println("Addidtion");
	}
	 void mul()
	{
		System.out.println("Multiplication");
	}
	protected void sub()
	{
		System.out.println("Subtraction");
	}
	private void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) {
		//WAP to access the 4 access specifiers within the same class
		Assignment54 As =new Assignment54();
		As.add();
		As.mul();
		As.sub();
		As.div();
	}

}
