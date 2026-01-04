package loopingstatements;

public class Sumoftheallnum {

	public static void main(String[] args) {
	 
		int num=5;
		int i=1;
		int sum=0;
		
		do {
			
			sum=sum+i; //1
			i++;
			
		}
		
		while(i<=5);
		System.out.println(sum);
	}

}
