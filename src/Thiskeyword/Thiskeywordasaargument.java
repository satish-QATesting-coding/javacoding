package Thiskeyword;


class Bank{
	
	void process(Bank b) {
		
		
		System.out.println("Call this Method");
	}
	
	void call() {
		process(this);
		
	}
}

public class Thiskeywordasaargument {

	public static void main(String[] args) {
		Bank obj= new Bank();
		obj.call();

	}

}
