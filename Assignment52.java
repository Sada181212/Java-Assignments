package javaassignments;
interface Interface1
{
	 public void method();
	 public void method1();
}

public class Assignment52 implements Interface1{
	public static void main(String[] args){
		// Create class and inherit property of interface
		Assignment52 a= new Assignment52();
		a.method();
		a.method1();
	}

	@Override
	public void method() {
		System.out.println("Mthod is called from main after overriden from the interface ");
		
	}

	@Override
	public void method1() {
		System.out.println("Mthod1 is called from main after overriden from the interface ");
		
	}

}
