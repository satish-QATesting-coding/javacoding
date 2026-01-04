package conditionalstatement;

public class Aarmstrongnum {

	public static void main(String[] args) {

		int num=153;
		int or=num;
		int result=0;
		
		while(num!=0) {
			
			 int D= num%10;
			  result= result+(D*D*D);
			  num=num/10;
			 	
		}
		
		if(result==or) {
			System.out.println("armstrong");
		}else {
			System.out.println("not a armostrong");
		}
		
				
	}

}
