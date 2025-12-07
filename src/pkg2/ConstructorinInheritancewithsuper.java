package pkg2;


class Animal
{
	Animal(){
       System.out.println("Animal Constructor");
		
	}
	
	
}

class Dog1 extends Animal{
	Dog1(){
		super();
		System.out.println("Dog Constructor");
	}
	
}
public class ConstructorinInheritancewithsuper {

	public static void main(String[] args) {
		
		Dog1 obj=new Dog1();
		
		
	}

}
