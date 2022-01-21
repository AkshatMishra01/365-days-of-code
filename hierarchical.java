package jj;

// hierarchical inheritance

class Alphabet{
	public void Attribute()
	{
		System.out.println("");
	}
}

class A extends Alphabet{
	public void Afun()
	{
		System.out.println("A");
	}
}

class B extends Alphabet{
	public void Bfun()
	{
		System.out.println("B");
	}
}

class D extends Alphabet{
	public void Dfun()
	{
		System.out.println("D");
	}
}

public class hierarchical {
	public static void main(String []args)
	{
		D d = new D();
		B b = new B();
		A a = new A();
		d.Dfun();
		b.Bfun();
		a.Afun();
	}
}
