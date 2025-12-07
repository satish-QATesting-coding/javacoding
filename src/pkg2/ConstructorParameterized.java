package pkg2;

class Par{
	
	String name;
	int price;
	String Brand;
	 Par(String n,int P,String B)
	{
		 name = n;
		price =P;
		Brand =B;
		System.out.println("Print name :" +name);	
		System.out.println("Print Price:" +price);		
		System.out.println("Print Brand:" +Brand);		

	}
	
	
}

public class ConstructorParameterized {

	public static void main(String[] args) {

		Par obj= new Par("Satti",5000,"SVR");
		
	}

}
