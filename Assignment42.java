package javaassignments;

public class Assignment42 {

	public static void main(String[] args) {
		//WAP from the given string input replace all the Capital letters with Nothing.Example: String name= "I am The Boss";
		
		String s ="I am The Boss";
		String s1=s.replaceAll("[A-Z]","");
		System.out.println(s1);

	}

}
