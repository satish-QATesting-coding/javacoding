package tackinginputfromuser;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		System.out.println("Enter first value");
		
		Scanner sc=new Scanner(System.in);
		
		  int a= sc.nextInt();
		  
		  
	System.out.println(" you entered value"+": " +a);
	
	System.out.println("Enter second value");
	int b=sc.nextInt();
	System.out.println("second value you eneterd is"+" : "+b);
	int c=a+b;
	System.out.println("Total value is" + " : "+ c);
	
	 System.out.println("Enter float value");
	 float f=sc.nextFloat();
	 System.out.println("you just entered float value"+ " :" + f);
	 
	 sc.nextLine();
	 System.out.println("Enter string ");
	 String str= sc.nextLine();
	 int x= str.length();
	 System.out.println("you just entered string"+ " :" + x);
	 
	 System.out.println("Enter your charrecter");
	 char ch=sc.next().charAt(0);
	 System.out.println("the charetre enterd by you is "+ ch);
			 
			sc.close(); 
	 
		
		
	}

}
