package pkg2;

class ATMMachine{
	
	String accountHolder;
	int pin;
	float balance;
	
	
	ATMMachine(String accountHolder,int pin,float balance){
		
		this.accountHolder	=accountHolder;
		this.pin=pin;
		this.balance=balance;
		
	}
	
	void checkBalance() {
		System.out.println("your account accountHolder"+ " " +accountHolder );
		System.out.println("your account balance"+ " " + balance);
	}
	void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("❌ Insufficient Balance! Withdrawal Failed"+ " "+amount);
		}else if (amount<=0) {
			System.out.println("❌ Invalid Amount!"+" "+amount);
		}else {
			balance= balance-amount;
			System.out.println("Amount Withdrawn"+" " +amount);
			System.out.println("Updated Balance"+" "+balance);
		}
	

	}
	void deposit(int amount) {
		balance	=balance+amount;
		System.out.println("total amont withdraw"+ " "+amount);
		System.out.println("total amont balance"+ " "+balance);
	}
}

public class ClassATMMachine {

	public static void main(String[] args) {
		ATMMachine obj=new ATMMachine("satish",4545,5000);
			
		obj.checkBalance();
		obj.withdraw(0);
		obj.deposit(5000);
		
		
	}

}
