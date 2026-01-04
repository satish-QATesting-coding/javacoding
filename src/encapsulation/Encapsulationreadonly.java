package encapsulation;


class roomrents{
	
	private int rent2=9000;

	public int getRent() {
	
		 return rent2;
		
	}
	
}


public class Encapsulationreadonly {

	public static void main(String[] args) {
		roomrents obj=new roomrents();
	System.out.println(obj.getRent());

	}

}
