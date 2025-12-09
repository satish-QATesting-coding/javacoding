package inheritance;


class A{
	int a;
	int b;
	int c;
	
	void displayA(){
		
		 c = a+b;
		
	System.out.println("Sum :"+ c);
				
	}
}
class B extends A
{
	void displayb() {
		
		 c= a*b;
		System.out.println("Mul :"+ c);
	}
	
}

class c extends B {
	
	
	void displayc() {
		
		c=a-b;
		System.out.println("sub :"+ c);
		
	}
}
public class InheritanceMultilevel {

	public static void main(String[] args) {
		c obj =new c();
		obj.a=20;
		obj.b=30;
		obj.displayA();
		obj.displayb();
		obj.displayc();

	}

}
