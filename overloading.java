package jj;

class gyro{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int e){
		return a+b+e;
	}
}

// number of arguments
public class overloading {

	public static void main(String args[])
	{
		System.out.println(gyro.add(4, 2, 3));
	}
}


package jj;

class gyro{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b){
		return a+b;
	}
}


// argument type based overloading 
public class overloading {

	public static void main(String args[])
	{
		System.out.println(gyro.add(4, 2));
		System.out.println(gyro.add(12.3, 11.6));
	}
}
