package javaassignments;

import basicprogram.Abstract_Class;

abstract class GoodleAuth{
	abstract void login();
	abstract void registraion();
}
public class Assignment22 extends GoodleAuth{

	public static void main(String[] args) {
		// WAP in which abstract class is present along with concrete class	
		Abstract_Class ac =new Abstract_Class();
		ac.login();
		ac.registraion();
	
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("Login methoda after overridden");
	}

	@Override
	void registraion() {
		// TODO Auto-generated method stub
		System.out.println("resgistraion methoda after overridden");

	}

}
