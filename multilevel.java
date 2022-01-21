package jj;

class lifeProcess{
	public void Emotions()
	{
		System.out.println("Love, Compassion, Affection, Care, Ego");
	}
	public void Attributes()
	{
		System.out.println("Intelligence, Logic,  Curiosity, Passion");
	}
}

class Parent extends lifeProcess
{
	public void display()
	{
		System.out.println("Hello User!");
	}
}

class Child extends Parent{
	int z;
	public int add(int x, int y)
	{
		z = x+y;
		System.out.println(z);
		return z;
	}
}

public class Inherit extends Child {
	public static void main(String []args)
	{
		Child c = new Child();
		c.display();
		c.add(23,16);
		c.Emotions();
	}
}
