// A PROGRAM WITH THE USE OF (THIS) KEYWORD.

package jj;

class that{
	int rollno;
	String name;
	float fee;
	that(int rollno, String name, float fee)
	{
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		
	}
	
	void display() {System.out.println(rollno + " " + name + " " + fee);};
}
public class Thisx{
	public static void main(String []args)
	{
		that t1 = new that(400,"Akshat",4000f);
		that t2 = new that(500,"Ajay", 6000f);
		t1.display();
		t2.display();
	}
	
}
