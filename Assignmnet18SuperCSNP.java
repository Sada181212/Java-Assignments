package javaassignments;

class SuperClass{
	SuperClass()
	{
		System.out.println("SuperClass");
	}	
}
class SubClass extends SuperClass{
	SubClass(int a)
	{
		super();
		System.out.println("SubClass");
	}
}
class ChildClass extends SubClass{
	ChildClass(int a, int b)
	{
		super(10);
		System.out.println("Child Class");
	}
}
public class Assignmnet18SuperCSNP extends ChildClass{
	Assignmnet18SuperCSNP()
	{
		super(10,20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignmnet18SuperCSNP();
	}

}
