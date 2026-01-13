package accessmodifiers;

// with in the class we call same method or variable

public class Private {
	
	private int x=10;
	  private void diaply() {
		  
		  System.out.println("Print Private");
	  }

	public static void main(String[] args) {
		
		Private obj=new Private();
		obj.diaply(); 
		 
		
	}

}
