	package pkg2;
	
	class Rectangle1{
		
		int length;
		int width;
		
		void area() {
			
			int A = length * width;
			System.out.println("area of Rectangle"+ " :" +A);
					
		}
	}
	
	public class classRectangleusingvariable {
		
		
		public static void main(String[] args) {
			Rectangle1 obj1=new Rectangle1();
			obj1.length=5;
			obj1.width =5;
			obj1.area();
		}
	
	}
