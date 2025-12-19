package Polymorphisam;

class C{
	
	static void show() {
				
		System.out.println("print A");
	}
}

class D extends C{
	
	static void show() {
		
		System.out.println("Print B");
		
	}
}

public class merthodoverriding2 {

	public static void main(String[] args) {
		C obj=new D();
		obj.show();

	}

}
