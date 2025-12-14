package variables;

class BankAccount2{
	
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

public class Variablesdiffrentobjects {

	public static void main(String[] args) {
		
		BankAccount2 obj= new BankAccount2();
		obj.accountNo= 345678901;
		obj.deposit(5000);
		obj.withdraw(4000);
		obj.showBalance();

		
		BankAccount2 obj2 = new BankAccount2();
         
		obj2.accountNo= 345678901;
		obj2.deposit(10000);
		obj2.withdraw(4000);
		obj2.showBalance();
		
		BankAccount2 obj3 = new BankAccount2();
        
		obj3.accountNo= 345678901;
		obj3.deposit(15000);
		obj3.withdraw(5000);
		obj3.showBalance();
		
		
	}

}
