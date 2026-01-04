package loopingstatements;

public class Revrcenum {

	public static void main(String[] args) {
		
		int num=121;
		int rev =0;
		
		int r= num;
		
		while(num!=0) {
			
			int D= num % 10;
			rev= rev*10 +D;
			num=num/10;
		}
		
		System.out.println(rev);
		
		if (r==rev) {
			System.out.println("num is pelindrom");
		}else {
			System.out.println("num is not pelindrom");

		}
	}

}
