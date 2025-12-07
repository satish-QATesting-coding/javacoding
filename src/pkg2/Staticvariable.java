package pkg2;

class staticv{
 String school ;
 String city;
 void display (){
	 System.out.println("Print school name"+" : "+school);
	 System.out.println("Print school name"+" : "+city);
 }
	
}

public class Staticvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		staticv obj= new staticv();
		obj.school="nvd";
		obj.city="pkd";
		obj.display();
		
		
	}

}
