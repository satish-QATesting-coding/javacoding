package finalkeyword;


class Constants{
	
	final int max=100;
	
	void display() {
		
		System.out.println("Print max value"+max);
	}
}




public class FinalVariable {

	public static void main(String[] args) {
		Constants obj =new Constants();
		obj.display();

	}

}
