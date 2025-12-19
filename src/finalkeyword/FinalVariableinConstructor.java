package finalkeyword;

class Employee {
	
	final int empId;
	Employee(int empId){
		
		this.empId =empId;
	}
	
	void diaply() {
		
		System.out.println("print emp id"+" :" +empId);
	}
	
}


public class FinalVariableinConstructor {

	public static void main(String[] args) {
		Employee obj1= new Employee(2345);
		
		
		obj1.diaply();
		
	}
	
	
}
