package javaassignments;
class Amazon_in
{
	private String Password="Sada@3232";

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password =password;
	}
}
public class Assignment75 {

	public static void main(String[] args) {
		//WAP using this keyword
		Amazon_in a=new Amazon_in();
		a.setPassword("Sada@4949");
	System.out.println(a.getPassword());
		
	}

}
