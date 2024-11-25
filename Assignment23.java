package javaassignments;
class MostSuperClass{
	public void method1()
	{
		System.out.println("Concrete method1 from MostSUperClass");
	}
	public void method2()
	{
		System.out.println("Concrete method2 from MostSUperClass");
	}
}
class Subclass1 extends MostSuperClass
{
	public void method7()
	{
		System.out.println("concrete method from subclass");
	}
}
abstract class child extends Subclass1 {
	abstract void method3();
	abstract void method4();
	public void method5()
	{
		System.out.println("concrete method5 from abtarct class");
	}
	public void method6()
	{
		System.out.println("concrete method6 from abtarct class");
	}
	
}

public class Assignment23 extends child{

	public static void main(String[] args) {
		// WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM

		Assignment23 a = new Assignment23();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		a.method5();
		a.method6();
		a.method7();
	}

	@Override
	void method3() {
		// TODO Auto-generated method stub
		System.out.println("Mthod 3 is a abtract method");
	}

	@Override
	void method4() {
		// TODO Auto-generated method stub
		System.out.println("Mthod 4 is a abtract method");
	}

}
