package pkg2;

class Mul{
	
	int mulp(int a, int b) {
		return a*b;
	}
	
	
}


public class reusebuleclass {

	public static void main(String[] args) {
      Mul obj = new Mul();
       int value = obj.mulp(500,600);
       System.out.println("valuof total"+ ": " +value);
	}

}
