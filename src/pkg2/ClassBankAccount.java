package pkg2;

class BankAccount
{	
	long accountNumber;
	float balance;
	
	void deposit(float amount) {
		balance =  balance +amount;
		System.out.println("Amount Deposited is" +amount);
		System.out.println("Your account balance is" +balance);

	}
	
		
}

public class ClassBankAccount {

	public static void main(String[] args) {
	
		BankAccount obj= new BankAccount();
		obj.accountNumber=8908973456L;
		obj.balance=50000f;
			
		obj.deposit(20000f);

	}

}
