package javaassignments;

class Parent_class extends Object
{
	void add() {
		
	}
}
public class Assignment76 extends Parent_class{

	void sub() {
		
	}
	public static void main(String[] args) {
		//Wap for classtypecasting(combination of upcasting and downcasting)
		Parent_class p	= new Assignment76();
		//implicit way of upcasting
		
		Parent_class p2	= (Parent_class)new Assignment76();
		//explicit way upcasting
		
		
		Assignment76 c1= (Assignment76)p;
		c1.add();
		c1.sub();
		
		
	}

}
