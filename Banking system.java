package jj;

import java.util.Scanner;

class Account{
	int acnum;
	String name;
	float amount = 15000;
	
	void deposit(int a,  float c)
	{
		acnum = a;
		amount += c;
		System.out.println("Updated account balance: " + amount);
	}
	void withdraw(int x, float z)
	{
		acnum = x;
		amount -= z;
		System.out.println("Amount withdrawn: " + z);
	}
	void display()
	{
		System.out.println("Current Balance is: " + amount);
	}
}
public class Bankingsystem {
	
@SuppressWarnings("resource")

public static void main(String args[])
{
	System.out.println("Welcome to ABCD bank");
	
	int s,num;
	float amt;
	Scanner scan = new Scanner(System.in);
	s = scan.nextInt();
	Account id = new Account();
	while(s != 0)
	{
		
	if(s == 1)
	{
		System.out.println("Enter amount: ");
		amt = scan.nextFloat();
		System.out.println("Enter your account number");
		num = scan.nextInt();
		id.withdraw( num, amt);
		break;
	}
	else if (s == 2)
	{
		System.out.println("Enter amount: ");
		amt = scan.nextFloat();
		System.out.println("Enter your account number");
		num = scan.nextInt();
		id.deposit(num,  amt);
		break;
	}
	else if (s == 3)
	{
		System.out.println("Enter your account number");
		num = scan.nextInt();
		id.display();
		break;
	}
	else if(s == 4)
	{
	System.out.println("Exiting...");
	break;
	}
	}
}
}
