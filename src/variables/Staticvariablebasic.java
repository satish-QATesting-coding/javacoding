package variables;

class test{
	
	
	static int x= 10;
	
	
}


public class Staticvariablebasic {

	public static void main(String[] args) {
	 test t1=new test();
	 test t2= new test();
	 t2.x=30;
	 System.out.println(t2.x);

	}

}
