package pkg2;

class Animals{
	
	void sound() {
		
		System.out.println("Barking");
	}
}

class Dog2 extends Animals{
	
	void sound(){
		super.sound();
		System.out.println("dog is braking");
	}
	
}

public class SurperAccessParentMethod {

	public static void main(String[] args) {
		Dog2 obj=new Dog2();
        obj.sound();
	}

}
