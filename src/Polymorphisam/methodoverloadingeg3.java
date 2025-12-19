package Polymorphisam;


class Calculator{
	
	int add(int a, int b){
		
		return a+b;
	}
	
 double add(double a, double b){
	 
	 return a+b;
 }
	
	int add(int a, int b, int c){
		
		return a+b+c;
	}
}


public class methodoverloadingeg3 {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.add(20, 20));
		System.out.println(obj.add(5.5, 5.5));
		System.out.println(obj.add(5, 5, 5));
		

	}

}
