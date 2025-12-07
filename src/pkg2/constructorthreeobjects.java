package pkg2;

class value{
	
	String name;
	int price;
	String Brand;
	value(String n,int P,String B)
	{
		 name = n;
		price =P;
		Brand =B;
		System.out.println("Expected :" +name + " |"+price+ "| "+ Brand);	
		

	}
	
	
}

public class constructorthreeobjects {

	public static void main(String[] args) {
		value obj1= new value("Satti",5000,"SVR");
		value obj2= new value("Ravi",6000,"kvr"); 
		value obj3= new value("raj",7000,"nvr");
	}

}
