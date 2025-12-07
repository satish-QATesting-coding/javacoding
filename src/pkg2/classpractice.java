package pkg2;

class student{
	
	String name;
	int Rollnum;
	
	void display() {
		
		System.out.println("Student name" + " : " + name);
		System.out.println("Student Rollno"+ " : " +Rollnum);
	}
}

public class classpractice {

	public static void main(String[] args) {
		
		student obj=new student();
		obj.name = "satish";
		obj.Rollnum= 625151;
		obj.display();

	}

}
