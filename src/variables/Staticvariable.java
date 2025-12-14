package variables;


class Employee{
	
	int id ;
	String name ;
	
	static String Companyname="svr tech";
	
	Employee (int id, String name){
		
		this.id=id;
		this.name=name;
		
	}
	
	void display() {
		System.out.println("print id"+id);
		System.out.println("print name "+name);
		System.out.println("print company + Comanyname");
		
	}
	
	
	
}



public class Staticvariable {

	public static void main(String[] args) {
		Employee e1 = new Employee(5110, "Satish");
        Employee e2 = new Employee(5111, "Ravi");
        Employee e3 = new Employee(5112, "Kumar");
        e1.display();
        e2.display();
        e3.display();
		

	}

}
