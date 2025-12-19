package Thiskeyword;


class Employee{
	
	int id;
	float salary;
	Employee(int id,float salary){
		
		this.id=id;
		this.salary=salary;
	}
	
	void showDetails() {
		System.out.println("Employee details"+" : " + id +" "+salary);
		
	}
}

public class ThiskeywordEmployee {

	public static void main(String[] args) {
		Employee obj= new  Employee(5462,678290f);
           obj.showDetails();
	}

}
