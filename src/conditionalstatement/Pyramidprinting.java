package conditionalstatement;

public class Pyramidprinting {

	public static void main(String[] args) {
      
		int n=5;
		int i,j;
		
		for(i=1;i<=n;i++) {
			
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
						
			for(j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
				

		
	}

}
