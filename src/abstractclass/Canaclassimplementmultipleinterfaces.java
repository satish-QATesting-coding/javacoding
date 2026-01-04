package abstractclass;

interface A1{
	
	void display();
	
}
interface A2{
	
	void show();
	
}
interface A3{
	
}

class o implements A1,A2,A3
{
	
	public void display()
	{
		System.out.println("hello");
	}	
	
	public void show() {
		
		System.out.println("HI");
	}
}



public class Canaclassimplementmultipleinterfaces {

	public static void main(String[] args) {
		A1 ref= new o();
		ref.display();
		A2 ref2= new o();
		ref2.show();

	}

}
