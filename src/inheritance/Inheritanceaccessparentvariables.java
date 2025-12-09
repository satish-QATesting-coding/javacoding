package inheritance;


class Employee {
	
	String name;
	int Salary;
	
	void display(String name,int Salary) {
		
	   this.name=name;
		this.Salary =Salary;
		
		System.out.println(name+Salary);
		
	}
	
}
class Developer extends Employee{
	String technology;
	void display(String name,int Salary,String technology)
	
	{
		super.display(name, Salary);
		this.technology =technology;
		System.out.println(name+Salary+technology);
	}
	
}




public class Inheritanceaccessparentvariables {

	public static void main(String[] args) {
		Developer obj= new Developer();
		obj.display("Satish", 5000, "Java");

	}

}
