package variables;

class add{
	
	void display() {
		
		int a= 10;
		int b= 20;
		int sum = a+b;
		
		System.out.println("Print sum"+ " : " +sum);
	}
}

public class LocalVeriable {

	public static void main(String[] args) {
		add obj= new add();
		obj.display();

	}

}
