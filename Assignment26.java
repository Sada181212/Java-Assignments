package javaassignments;

public class Assignment26 {

	public static void main(String[] args) {
		// Write a program where to check the given strings are palindrome or not.

		String s ="tat";
		String r ="";
		for(int i=2;i>=0;i--)
		{
			char c =s.charAt(i);
			r=r+c;
			
		}
		System.out.println(r);
		boolean b =s.equals(r);
		if(b==true)
		{
			System.out.println(s+" "+ "is " +"Palindrom");
		}
		
	}

}
