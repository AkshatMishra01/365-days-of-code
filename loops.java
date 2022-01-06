// all the types of loops in java programming language 

//simple while loop
package jj;

public class while1 {
	public static void main(String args[])
	{
		int i =1;
		while(i>0) {
			System.out.println("Hello!!");
			i--;
		}
	}
}

//do while loop in java 
package jj;

public class dowhile {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			
			i++;
		}while(i<=10);
	}

}

// nested for loop in java
package jj;

public class loop {
public static void main(String[] args) {
int term=6;  
for(int i=1;i<=term;i++){  
for(int j=1;j<=i;j++){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}  
}  
}
