package pkg2;


class Vehicle{
	int wheels;
	Vehicle(int wheels){
		this.wheels=wheels;
		System.out.println("Number of wheels:"+wheels);
	}
}

class Car extends Vehicle{
	
	 String brand;
	 
	 Car(int wheels,String brand){
		 super(wheels);
		 this.brand=brand;
		 System.out.println("brand :" +brand);
		 
	 }
	
} 

class SportsCar extends Car {
	
	String color;
	int price;
	int maxSpeed;
	SportsCar(int wheels,String brand,int maxSpeed){
		super(wheels,brand);
		this.maxSpeed=maxSpeed;
		System.out.println("max speed:"+ maxSpeed);
		
		}
	
	SportsCar setcolor(String color) {
		this.color=color;
		return this;
	}
	
	SportsCar setprice(int price) {
		this.price=price;
		return this;
	}
	
	
	  void showDetails() {
		  
		  System.out.println("color:"+color);
		  System.out.println("Price:"+price);
		  
	  }
}

public class SuperConstructorChainingMethodChaining {

	public static void main(String[] args) {
		new SportsCar(4,"bmw",220).setcolor("Red").setprice(100000).showDetails();
		
		

	}

}
