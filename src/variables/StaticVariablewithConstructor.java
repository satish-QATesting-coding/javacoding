package variables;


public class StaticVariablewithConstructor {
	
		
		static int count=0;
		StaticVariablewithConstructor(){
			  
			  count++;
		  }
	

	public static void main(String[] args) {
		
		new StaticVariablewithConstructor();
		new StaticVariablewithConstructor();
		new StaticVariablewithConstructor();
		System.out.println(count);
		
		
	}

}
