package protectedEx1;

class p1{
	
	protected void display2() {
		
		System.out.println("Display p1 class method");
	}
}

public class Protectedclass1 {
	
 protected void display() {
		 
		 System.out.println("Display class1 method");
	 }

	public static void main(String[] args) {
		Protectedclass1 obj1=new Protectedclass1();
		obj1.display();
		
		p1 obj2=new p1();
		obj2.display2();

	}

}
