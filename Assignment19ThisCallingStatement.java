package javaassignments;

public class Assignment19ThisCallingStatement {

	Assignment19ThisCallingStatement()
	{
		
		System.out.println("1");
	}
	Assignment19ThisCallingStatement(int a)
	{
		this();
		System.out.println("2");
	}
	Assignment19ThisCallingStatement(int a, String b)
	{
		this(10);
		System.out.println("3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Assignment19ThisCallingStatement(10,"krishna");
	}

}
