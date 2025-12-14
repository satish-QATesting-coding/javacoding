package variables;



class sampletest{
	int x= 5; 
	void display() {
		
		int x=10;
		System.out.println(x);
	}
	
}
public class LocalvsInstanceVariable {

	public static void main(String[] args) {
		
        new sampletest().display();
        
	}

}
