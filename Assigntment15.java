package javaassignments;
class two {
	
	 public void add()
	 {
		 System.out.println("Adding metthod called from child/sub class ");
	 }
	 public void Sub()
	 {
		 System.out.println("Subtracting metthod called from child/sub class");
	 }
}
public class Assigntment15 extends two{	

		public static void main(String[] args) {
		
	
			Assigntment15 as =new Assigntment15();
	 as.add();
	 as.Sub();
	 as.mul();
	 as.div();
	}
		public void mul()
		 {
			 System.out.println("multipliaction");
		 }
		 public void div()
		 {
			 System.out.println("Divisison");
		 }

}

