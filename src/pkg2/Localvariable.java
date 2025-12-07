package pkg2;

class localvariableP{
	
	void display() {
		int a= 10;
		int b = 15;
		int c= a+b;
		System.out.println("total"+ ": " +c);
	}
}
public class Localvariable {

	public static void main(String[] args) {
      
		localvariableP obj=new localvariableP();
		obj.display();
		
	}

}
