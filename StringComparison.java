package jj;

public class strins2 {
	public static void main(String []args)
	{
		String s1 = "Akshat";
		String s2 = "Daddy";
		
		// comparison of strings on the basis of ASCII order of preferential orders.
		if(s1.compareTo(s2) == 0) {
			System.out.println("Equal");
		}
		else if(s1.compareTo(s2)>0){
			System.out.println("s1>s2");
		}
		else {
			System.out.println("s2>s1");
		}
	}
}
