package javaassignments;

public class Assignment27 {

	public static void main(String[] args) {
		// Write a program where you get an array index out of bound exception.
		
		int [] rollno=new int[4];
		rollno[0]=78;
		rollno[1]=7;
		rollno[2]=79;
		rollno[3]=73;
		for(int i=0;i<=3;i++)
		{
			System.out.println(rollno[i]);
		}
		
		String [] name = new String[3];
		name[0]="ram";
		name[1]="shyam";
		name[2]="laxman";
		for(int i=0;i<=3;i++)
		{
			System.out.println(name[i]);
		}

		
	}

}
