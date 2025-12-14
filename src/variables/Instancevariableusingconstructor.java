package variables;


class S0{
	
	String name;
	int Rollno;
	
	
	S0(String name,int Rollno){
		
	 this.name=name;
	 this.Rollno=Rollno;
	}
	
	void display() {
		
		System.out.println("Print name " + name);
		System.out.println("Print name " + Rollno);
	}
}

public class Instancevariableusingconstructor {

	public static void main(String[] args) {
		S0 obj= new S0("SATISH",530);
		obj.display();

	}

}
