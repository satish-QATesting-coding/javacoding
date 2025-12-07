package pkg2;


class Calculator {
	int a;
	int b;
	void add() {
		System.out.println("add:"+ (a+b));
	}
	void sub() {
		System.out.println("sub :"+ (a-b));
		
	}
	void mul() {
		System.out.println("mul :"+ (a*b));
	}
	void div() {
		System.out.println("div :"+ (a/b));
	}
}

public class Methodcalculator {

	public static void main(String[] args) {
		Calculator obj =new Calculator();
		obj.a=10;
		obj.b=10;
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

	}

}
