package Thiskeyword;


class Laptop{
	
	
	Laptop(){
		
		System.out.println("Laptop created");
		
	}
	
	Laptop(String Brand){
		
       this();
       System.out.println("print brand name "+ " : "+ Brand);
		
	}
}

public class Thistocallcurrentclassconstructor {

	public static void main(String[] args) {
		Laptop obj= new Laptop("Lenovo");
		

	}

}
