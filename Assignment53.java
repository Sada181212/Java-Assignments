package javaassignments;
interface Interface2
{
	 public void method();
	 public void method1();
}
class Subclassa implements Interface2
{
	public void method2()
	{
		System.out.println("Method2 is from subclass");
	}

	@Override
	public void method() {
		System.out.println("Mthod is called from subclassa after overriden from the interface ");
		
	}

	@Override
	public void method1() {
		System.out.println("Mthod1 is called from subclassa after overriden from the interface ");
		
	}
}
public class Assignment53 extends Subclassa{

	public static void main(String[] args) {
		//WAP in which we are writing extends & implements keywords in a subclass
		Assignment53 a=new Assignment53();
		a.method();
		a.method1();
		a.method2();
	}

}
