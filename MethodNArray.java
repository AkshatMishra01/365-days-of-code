public class a1 {
	
	public void display(int arr[])
	{
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String args[])
	{
		a1 o = new a1();
		int a[] = {0,1,2,3,4,5,6,7,8,9};
		o.display(a);
	}
}
