package Thiskeyword;


class Car{
	
    void start(){
    	
    	System.out.println("car will start now");
    	
    }	
    
    void drive() {
    	this.start();
    	System.out.println("we can drive");
    }
	
}

public class Thiskeywordmethod {

	public static void main(String[] args) {
		Car obj= new Car();
		obj.drive();
		
		
	}

}
