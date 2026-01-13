package tackinginputfromuser;

import java.util.Scanner;

public class MenuDrivenprogram {

	public static void main(String[] args) {
        
		System.out.println("Enter your atm card ");
		Scanner sc= new Scanner(System.in);
		  String card=sc.nextLine();
		  System.out.println("Thanks for entering card,proces started "+card);
		  
		 System.out.println("Enter your pin");
		 int pin=sc.nextInt();
		 System.out.println("Thanks for entring pin ****");
		
		 int Choice;
		 
		 double balance =10000;
		 
		 do {
			 
			 System.out.println("1.Check balance");
			 System.out.println("2.Deposite money");
			 System.out.println("3.Withdraw money");
			 System.out.println("4.exit");
			 System.out.println("Enter your choice: ");
			 
			 Choice= sc.nextInt();
			 
			 switch(Choice){
			 case 1:
				 System.out.println("Your balance is "+" : "+balance);
				 break;
			 case 2:
				 System.out.println("Enter your Deposit amout");
				  double deposit=sc.nextDouble();
				  System.out.println(" your total deposit amont is"+deposit);
				   balance=deposit+balance;
				  System.out.println("Your toatal balance amount is "+ balance);
				  break;

			 case 3:
				 System.out.println("Enter your withdraw amonut");
				   double withdraw=sc.nextDouble();
				  System.out.println("Your Withdraw amount is"+ ": "+withdraw);
				  balance=balance-withdraw;
				  System.out.println(" Your balance amount is"+ " :" +balance);
				  break;
				  
			 case 4:
				  System.out.println("Thank you");
		        break;
		        
		      default:
		    	  System.out.println("invalid chioice");
		
				 
				 
			 }
			 
		 }while(Choice !=4);
		 
		 sc.close();
			 
			 
		 
		 
		 
		 }

}
