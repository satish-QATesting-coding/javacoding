package pkg2;



class Dog{
	String breed;
	int age;
	
	void bark() {
		System.out.println("Dog is barking");
	}
}



public class ClassDog {

	public static void main(String[] args) {
		Dog obj =new Dog();
		obj.bark();

	}

}
