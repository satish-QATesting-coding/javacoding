package pkg2;

class car{
	
	String brand;
	float price;
	int speed;
	
	car(String brand,float price,int speed){
		
		this.brand=brand;
		this.price=price;
		this.speed=speed;
	}
	
	void accelerate() {
		System.out.println("Car Brand"+ " : " + brand);
		System.out.println("car price"+ " : " + price);
		System.out.println("car speed"+ " : " + speed);

	}
	void brake() 
	{
		System.out.println("When you apply break.Car will slow down");
	}
	
	
}
public class Classcar {

	public static void main(String[] args) {
      car obj1=new car("BMW",500000,250);
      car obj2=new car("hundai",100000,120);
      
      obj1.accelerate();
      obj1.brake();
      
      obj2.accelerate();
      obj2.brake();
      
		
		
	}

}
