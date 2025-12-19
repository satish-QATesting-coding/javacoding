package finalkeyword;


class Bank{
	
	final void interest() {
		
		System.out.println("interest rate is 10%");
	}
	
}

class SBI extends Bank{
	
//	void interest() {  // we can't over ride method but inharit the call and run 
//		
//	}
}

public class FinalMethod {

	public static void main(String[] args) {
		 SBI obj = new SBI();
	        obj.interest();

	}

}
