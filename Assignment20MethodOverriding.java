package javaassignments;
class aaa
{
	void add() {
		System.out.println("class a");
	}
}
class bbb extends aaa
{
	void add() {
		System.out.println("class b");
	}
}

public class Assignment20MethodOverriding extends bbb{
	public static void main(String[] args) {
		Assignment20MethodOverriding ob= new Assignment20MethodOverriding();
		ob.add();
	}
}
