package javaassignments;

 class one {
	
	 public static void add()
	 {
		 System.out.println("Adding metthod called from child/sub class ");
	 }
	 public static void Sub()
	 {
		 System.out.println("Subtracting metthod called from child/sub class");
	 }
}

public class AssignmentSingleLevelInheritanceStatic14 extends one{

	public static void mul()
	 {
		 System.out.println("multipliaction");
	 }
	 public static void div()
	 {
		 System.out.println("Divisison");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		Sub();
		mul();
		div();
	}

}
