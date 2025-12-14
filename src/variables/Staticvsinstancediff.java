package variables;

class demo{
	
	
	int a = 5;
    static int b = 10;
}

public class Staticvsinstancediff {

	public static void main(String[] args) {
		demo d1 =new demo();
		demo d2=new demo();
		
		d1.a=20;
	    d2.b=30;
		
		 System.out.println(d2.a);
	     System.out.println(d2.b);
		
		

	}

}
