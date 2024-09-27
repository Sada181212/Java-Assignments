package javaassignments;
class aa
{
	aa()
	{
		System.out.println("1");
	}
}
class bb extends aa
{
	 bb(int a) 
	{
		
		System.out.println("2");
	}
}


public class Assingment17SuperCalling extends bb {

	
	Assingment17SuperCalling()
	{
		super(10);
		System.out.println("3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assingment17SuperCalling();
	}

}
