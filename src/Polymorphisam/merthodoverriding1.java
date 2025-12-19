package Polymorphisam;

class A{
	
	void show() {
				
		System.out.println("print A");
	}
}

class B extends A{
	
	void show() {
		
		System.out.println("Print B");
		
	}
}

public class merthodoverriding1 {

	public static void main(String[] args) {
		A obj=new B();
		obj.show();

	}

}
