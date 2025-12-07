package pkg2;

class Cover{
	
	int price;
	int value;
	String name;
	float fan;
	Cover(int P,int v,String n)
	{
		price =P;
		value =v;
		name = n;
	}
	 Cover(int P,int v,String n,float f)
	{
	  this(P,v,n);
	   fan = f;
	}
	
	 void display()
         {
		 System.out.println( price+" "+ value+" " + name+" "+fan);
		 
         }
	 }

public class ConstructorOverloading {

	public static void main(String[] args) {
		Cover obj=new Cover(89,90,"satti");
         obj.display();
	}

}
