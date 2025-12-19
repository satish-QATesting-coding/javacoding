package Thiskeyword;


class student{
	
	String name;
	int age;
	student(String name,int age){
		this.name=name;
		this.age=age;
				
	}
	
	void display() {
		
		System.out.println("Student name:" + name+" "+age);
	}
}

public class Thistodifferentiatevariables {

	public static void main(String[] args) {
		student obj=new student("satish",30);
		obj.display();

	}

}
