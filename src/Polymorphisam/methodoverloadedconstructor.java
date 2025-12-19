package Polymorphisam;

class Student{
	
	int id;
	String name;
	int age;
	
	Student(int id){
		this.id=id;
		System.out.println("print id"+ ":"+id);
		
	}

	Student(int id, String name){
		this.id=id;
		this.name=name;
		
		System.out.println("print id and name"+ " :" + id +":"+ name);
		
	}

	Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println("print id,name,age"+ " :" + id +":"+ name + " :"+age);
		
	}
	
			
		
	}
	


public class methodoverloadedconstructor {

	public static void main(String[] args) {
		new Student(625252,"satish",30);

	}

}
