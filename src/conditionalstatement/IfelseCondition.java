package conditionalstatement;

public class IfelseCondition {

	public static void main(String[] args) {
		
		
		int Buyprice =600;
		
		int ActualPrice= 450;
		
		if(Buyprice==ActualPrice) 
		{
			System.out.println("Selling as actual");
			
		}else if(Buyprice>ActualPrice)
		{
		 	System.out.println("More amount your paying");
		}else if(Buyprice<ActualPrice) 
		{
		     System.out.println("you burgined,got the for less price");	
		}else if (Buyprice !=ActualPrice) {
			
			System.out.println("Dont Buy");
		}

	}

}
