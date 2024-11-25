package javaassignments;

public class Assignment36 {
	static int count_of_alphabet;
	static int count_of_mumerc;
	static int count_of_space;
	public static void main(String[] args) {
		// WAP to find out the alphabates char, digits, spaces, and special char from the given strings.
		String input="kv no 2 bangalore";
		char c1[]=input.toCharArray();
		for(int i=0;i<input.length();i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				count_of_alphabet++;
			}
			boolean b2 = Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_mumerc++;
			}
			boolean b3=Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}System.out.println(count_of_alphabet);
		System.out.println(count_of_mumerc);
		System.out.println(count_of_space);
		int count_of_specialchartr =input.length()-(count_of_alphabet+count_of_mumerc+count_of_space);
		System.out.println(count_of_specialchartr);
	}

}
