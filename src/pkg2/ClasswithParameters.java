package pkg2;

class A{
	void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	void bankbalance(String name, double salary) {
		
		System.out.println(name+ " "  + "Your bank balance is:" + salary );
	}
}


public class ClasswithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj=new A();
		obj.add(10, 15);
		obj.bankbalance("satish", 500000);
		
	}

}
