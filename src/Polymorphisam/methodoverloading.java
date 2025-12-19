package Polymorphisam;


class MathOperations{
	
	int multiply(int a, int b){
		
		return a *b;
	}

	int multiply(int a, int b, int c){
		return a*b*c;
	}
	
	 
	
}


public class methodoverloading {

	public static void main(String[] args) {
		MathOperations obj=new MathOperations();
		System.out.println(obj.multiply(10, 10));
		System.out.println(obj.multiply(10, 10, 10));

	}

}
