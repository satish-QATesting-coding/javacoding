package variables;


	

	


public class StaticBlock {

		
	static int x;
	
	static {
		
		x= 50;
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println(x);

	}

}
