package javaassignments;

class a
{	
	void add() {
		System.out.println("adding");
	}
}
class b extends a
{
	void sub() {
		System.out.println("subtracting");
	}
}
class c extends b
{
	void mul() {
		System.out.println("multiplying");
	}
}
class d extends c
{
	
	void div() {
		System.out.println("deviding");
	}
}

public class Assignement16MultilevelInheritance extends d{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignement16MultilevelInheritance as =new Assignement16MultilevelInheritance();
		as.add();
		as.sub();
		as.mul();
		as.div();
		
	}

}
