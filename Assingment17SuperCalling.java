package javaassignments;
class aa
{
	aa()
	{
		System.out.println("1");
	}
}

public class Assingment17SuperCalling extends aa {

	
	Assingment17SuperCalling()
	{
		super();
		System.out.println("3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assingment17SuperCalling();
	}

}
