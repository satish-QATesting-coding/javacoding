package abstractclass;


abstract class Bank{
	
	abstract void interestRate();
	void diplayBank() {
		
		System.out.println("Bank name SBI");
		
	}
}

class Bank2 extends Bank{
	
	 void interestRate() {
		 
		 System.out.println("interest rate is 9.5%");
	 }
	
}

public class Abstractclass1 {

	public static void main(String[] args) {
		Bank obj= new Bank2();
		obj.diplayBank();
		obj.interestRate();

	}

}
