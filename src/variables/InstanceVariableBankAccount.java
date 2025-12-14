package variables;

class BankAccount{
	
	long accountNo;
	float balance;
	
	
	void deposit(float amount) {
		balance= balance+amount;
				
		System.out.println("Deposit amount " +amount);
	}
	
	void withdraw(float amount) {
		
		balance= balance-amount;
		System.out.println(" withdraw amount" + balance);
	}
	
	void showBalance() {
			
		System.out.println("Show balance " +balance);
	}
}

public class InstanceVariableBankAccount {

	public static void main(String[] args) {
		BankAccount obj= new BankAccount();
		obj.accountNo= 345678901;
		obj.deposit(5000);
		obj.withdraw(4000);
		obj.showBalance();

	}

}
