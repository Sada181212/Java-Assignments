package javaassignments;
interface anant
{
	public void method1();
	public void methdod2();
	
}
interface gauri
{
	public void method3();
	public void method4();
}
public class Assignments24 implements anant,gauri{

	public static void main(String[] args) {
		// WAP on multiple level inheritance using Interface
		Assignments24 a = new Assignments24();
		a.method1();
		a.methdod2();
		a.method3();
		a.method4();
	}

	@Override
	public void method3() {
		System.out.println("method3 of gauri interface");
		
	}

	@Override
	public void method4() {
		System.out.println("method4 of gauri interface");
		
	}

	@Override
	public void method1() {
		System.out.println("method1 of anant interface");
		
	}

	@Override
	public void methdod2() {
		System.out.println("method2 of anant interface");
		
	}

}
