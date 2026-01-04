package abstractclass;


interface Vechile{
	
	void start();
	
}

class car implements Vechile{
	
	 public void start() {
		 
		 System.out.println("Car starts");
	 }
	
}
public class Interface1 {

	public static void main(String[] args) {
		car obj= new car();
		obj.start();
	}

}
