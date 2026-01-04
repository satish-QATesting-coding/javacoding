package conditionalstatement;

public class InvertedRightTriangle {

	public static void main(String[] args) {
          
		int count=2;
		int i,j;
		
		for(i=1;i<=count;i++) {
			
			for(j=1;j<=count-i+1;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
	}

}
