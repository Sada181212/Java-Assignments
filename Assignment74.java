package javaassignments;
class Amazon_info
{
private String emailid ="sada@gmai.com";

public String getEmailid()
{
	return emailid;
}
public void setEmailid(String emailid)
{
	this.emailid=emailid;
}
}
public class Assignment74 {

	public static void main(String[] args) {
		// WAP for Encapsulation
		
		Amazon_info ai = new Amazon_info();
		ai.setEmailid("saurabh@gmail.com");
		
		System.out.println(ai.getEmailid());
	}

}
