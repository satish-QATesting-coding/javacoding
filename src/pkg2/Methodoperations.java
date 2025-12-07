package pkg2;

class MathOperations{
	
	
	void add(int a,int b) {
		
	
		int c= a+b;
		System.out.println("Total"+" :" +c);
	}
}

public class Methodoperations {

	public static void main(String[] args) {
		MathOperations obj= new MathOperations();
		obj.add(5, 5);

	}

}
