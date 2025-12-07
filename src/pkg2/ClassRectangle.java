package pkg2;

class Rectangle{
	
	void area(int length, int width) {
		
		int A = length * width;
		System.out.println("area of Rectangle"+ " :" +A);
				
	}
}


public class ClassRectangle {

	public static void main(String[] args) {
		
		Rectangle obj=new Rectangle();
		obj.area(5,5);
		
         
	}

}
