package javaassignments;
public class Assignment49 {

	public static void main(String[] args) {
		/*
		 * WAP where the your name is like "Manish" and print the output like: m a n i s h
		 *  And Print the second output as like: h s i n a m
		 */
		String s ="manish";
		for(int i=0;i<=s.length()-1;i++)
		{
		System.out.println(s.charAt(i));
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	
	}

}
