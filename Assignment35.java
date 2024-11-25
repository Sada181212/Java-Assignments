package javaassignments;

import java.util.Arrays;

public class Assignment35 {

	public static void main(String[] args) {
		// WAP to check the given two  strings are anagram or not.
		
		String s1="cafee";
		String s2="face";
		if(s1.length()!=s2.length())
		{
			System.out.println("they are not annagram ");
		}
		else
		{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b1=Arrays.equals(c1, c2);
		if(b1==true) {
			System.out.println("the given string is annagram");
		}
		
		}}

}
