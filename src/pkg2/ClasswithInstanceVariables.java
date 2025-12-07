package pkg2;

class i
{
	String name= "satish";
	int id=625251;
	static double salary =50000;
	
	void display() {
		System.out.println(name+ " " +id + " " +salary);
		
	}
}

public class ClasswithInstanceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		i obj=new i();
		obj.display();
	}

}
