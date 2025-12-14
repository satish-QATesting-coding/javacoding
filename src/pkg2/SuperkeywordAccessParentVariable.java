package pkg2;


class Vehicle1{
	
	int speed;
	void displayspeed() {
	    
		System.out.println(speed);
	 
	}
	
}
class car1 extends Vehicle1 
{
	
	void speed() {
		super.displayspeed();
		System.out.println(speed);
	}
}


public class SuperkeywordAccessParentVariable {

	public static void main(String[] args) {
		car1 obj=new car1();
		((Vehicle1)obj).speed=300;
		obj.speed=120;
		obj.speed();

	}

}
