package inheritance;

class Calculator{
	int a;
	int b;
	int c;
	
	void add(){
		
		int c = a+b;
		
	System.out.println("Sum :"+ c);
				
	}
}
class AdvancedCalculator extends Calculator
{
	void multiply() {
		
		int c= a*b;
		System.out.println("Mul :"+ c);
	}
	
}

public class InheritanceSingle {

	public static void main(String[] args) {
		AdvancedCalculator obj = new AdvancedCalculator();
		obj.a=10;
		obj.b=10;
		obj.add();
		obj.multiply();

		
		
	}

}
