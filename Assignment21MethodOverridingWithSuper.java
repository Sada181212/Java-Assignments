package javaassignments;
class Gf{
	void add()
	{
		System.out.println("adding form grand father class");
	}
}
class F extends Gf
{
	void add()
	{
		super.add();
		System.out.println("adding from father class");
	}
}
class Ch extends F
{
	void add()
	{
		super.add();
		System.out.println("adding from child class");
	}
}
public class Assignment21MethodOverridingWithSuper extends Ch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment21MethodOverridingWithSuper obj =new Assignment21MethodOverridingWithSuper();
		obj.add();
	}

}
