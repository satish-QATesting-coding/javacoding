package Polymorphisam;



class Display{
	
	int show(int a) {
		 return a;
		
	}
	
	String show(String name) {
		
		return name;
	}
	
	
	
}

public class methodoverlaodingeg2 {

	public static void main(String[] args) {
		Display obj=new Display();
		System.out.println(obj.show(23));
		System.out.println(obj.show("satti"));

	}

}
