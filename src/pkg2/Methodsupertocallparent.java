package pkg2;

class carc{
	
	void carcolor() {
		
		System.out.println("Car color is Blue");
	}
}

class carspeed extends carc{
	void speed()
	{
		System.out.println("car speed is 100kmph");
	}	
	
	void display()
        { 
		  super.carcolor();
		  speed();
		
		}
	}

public class Methodsupertocallparent {

	public static void main(String[] args) {
//		carc obj1= new carc();
//		obj1.carcolor();
//		carspeed obj2 =new carspeed ();
//		obj2.speed();
		carspeed obj3= new carspeed();
		obj3.display();
		
		
		
		}

}
