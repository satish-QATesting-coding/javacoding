package pkg2;

class dup{
	
	int price;
	int value;
	String name;
	float fan;
	dup(int P,int v,String n)
	{
		price =P;
		value =v;
		name = n;
	}
	dup(dup obj){
	
		price =obj.price;
		value = obj.value;
		name =obj.name;
	}
	void display()
    {
	 System.out.println( price+" "+ value+" " + name);
	 
    }
	
}



public class Constructorcopy {

	public static void main(String[] args) {
		
		dup s1=new dup(80,90,"satish");
		dup s2= new dup(s1);
		s1.display();
		s2.display();
		
	}

}
