package javaassignments;

public class Assignment45 {

	public static void main(String[] args) {
		/*
		 * WAP to check from the given string find the letter start with c or
		 * not.
		 * 
		 * Example: String name= "cat";
		 */
		
		String s ="cat";
		boolean b =s.matches("c(.*)");
		System.out.println(b);

	}

}
