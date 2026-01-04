package abstractclass;

abstract class name{
	
	
	void displayname() {
		
		System.out.println("the name is raj");
		
	}
}

class age extends name{
	
	 @Override
    void displayname() {
		
		 super.displayname();
		System.out.println("the age is 30");
}
}

public class Abstractclasswitoutabstractmethod {

	public static void main(String[] args) {
		name obj= new age();
		obj.displayname();
		
	
	}
}
