package pkg2;

class Employee{
	
	void emp(String empname,int salary ){
		
		System.out.println("Emp Name"+ " :" + empname);
		System.out.println("Emp salary"+ " :" + salary);
	}
	
}

public class ClassEmployee {

	public static void main(String[] args) {
		Employee obj =new Employee();
		 obj.emp("satish", 5000);
		
	}

}
