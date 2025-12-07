package pkg2;

class constructores{
	String empname;
	int empage;
	constructores(String name,int age){ 
		empname = name;
	empage= age;
	}
	void display() {
		System.out.println(empname + " " + empage);
	}
}

public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructores obj = new constructores("satish",30);
		obj.display();
		
	}

}
