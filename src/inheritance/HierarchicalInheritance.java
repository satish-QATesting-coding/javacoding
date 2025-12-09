package inheritance;


class Person {
	
	
	void greet(){
		
		System.out.println("Hello from Person");
	}
}
class Student extends Person{
	
	void study(){
		
		System.out.println("Student is studying");
		
		
	}
}
class Teacher extends Person{
	
	void teach() {
		System.out.println("Teacher is teaching");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		Student obj = new Student();
        obj.greet();
        obj.study();
        
        Teacher obj2=new Teacher();
        obj2.greet();
        obj2.teach();
	}

}
