package Pack1;

import java.util.Scanner;
public class stringdrome {
	public static void main(String args[])
	{
		String original,reverse = "";
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		original = s.nextLine();
		int length = original.length();
		
		for(int i = length-1; i>=0 ; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("Non-palindrome");
		}
	}
}
