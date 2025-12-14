package variables;

class c1{
	
	int y=10;
	
 void display()
{
		
		int y=20;
		System.out.println(this.y);
		
}
	
}

public class StatcicMethod {

	public static void main(String[] args) {
		new c1().display();

	}

}
