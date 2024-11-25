package javaassignments;

public class Assignment34 {

	public static void main(String[] args) {
		// WAP where the size of the array is 4, and check whether a given value (such as 50) is a part of the array or not.
		int no[]=new int[4];
		no[0]=70;
		no[1]=71;
		no[2]=72;
		no[3]=38;
		int notocheck =38;
		for (int i=0;i<4;i++)
		{
			if(notocheck==no[i])
			{
				System.out.println(notocheck + " is the part of given index position "+ i);
			}
		}
	}

}
