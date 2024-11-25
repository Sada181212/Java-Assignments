package javaassignments;

public class Assignment25 {

	public static void main(String[] args) {
		// Write a program on reverse a string.
		String s="saurabh";
		String r="";
		for (int i=6;i>=0;i--)
		{
			char c1=s.charAt(i);
			r=r+c1;
		}
		System.out.println(r);
	}

}
